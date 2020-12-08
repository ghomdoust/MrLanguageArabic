package com.example.mrlanguagearabic;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.viewpager.widget.ViewPager;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;


import com.example.mrlanguagearabic.util.IabHelper;
import com.example.mrlanguagearabic.util.IabResult;
import com.example.mrlanguagearabic.util.Inventory;
import com.example.mrlanguagearabic.util.Purchase;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.tabs.TabLayout;

import org.apache.commons.net.ntp.NTPUDPClient;
import org.apache.commons.net.ntp.TimeInfo;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    private ViewPager view_pager;
    private TabLayout tab_layout;
    private Toolbar toolbar;
    private ImageView image_menu;
    private DrawerLayout drawer;
    private SharedPreferences sharedPreferences;

    static final String TAG = "MainActivity";
    public final String TIME_SERVER = "time.nist.gov";
    static final String SKU_SUBSCRIPTION = "aghayezabanarabic";
    private String base64EncodedPublicKey = "MIHNMA0GCSqGSIb3DQEBAQUAA4G7ADCBtwKBrwCiMW68orQx0s6eiXyqsc7OzmIBJdCf1nODYiNH6dZ2mP3c3rd90cSeZhpfLfU2cpDWL/UIA73ZwjVdbwOIr1FnyyEAhL7uZqgS0I151oXJYlBF+L7K0K1FLFHcfa6mhESnAnOOrAhtD3IBfUYyuGPeS6u0Pol9p6EVWN3QPUswRQDeuZ0/FVgZsXMy2qLfzfFnkMd01EWzjdMtomY2raehqxgL4flZW7ZrhEjtYOsCAwEAAQ==";
    boolean isSubscribed = false;
    static final int RC_REQUEST = 1000;
    IabHelper mHelper;
    private AlertDialog.Builder exitAlert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        exitAlert = new AlertDialog.Builder(this);
        mHelper = new IabHelper(this, base64EncodedPublicKey);

        Log.d(TAG, "Starting setup.");
        mHelper.startSetup(new IabHelper.OnIabSetupFinishedListener() {
            public void onIabSetupFinished(IabResult result) {
                Log.d(TAG, "Setup finished.");
                if (!result.isSuccess()) {
                    // Oh noes, there was a problem.
                    Log.d(TAG, "Problem setting up In-app Billing: " + result);
                }
                // Hooray, IAB is fully set up!
                mHelper.queryInventoryAsync(mGotInventoryListener);
            }
        });
    }

    private void initViews() {
        view_pager = findViewById(R.id.view_pager);
        tab_layout = findViewById(R.id.tab_layout);
        toolbar = findViewById(R.id.tool_bar);
        image_menu = findViewById(R.id.image_menu);
        drawer = findViewById(R.id.drawer);

        image_menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (drawer.isDrawerOpen(Gravity.RIGHT)) {
                    drawer.closeDrawer(Gravity.RIGHT);
                    return;
                }
                drawer.openDrawer(Gravity.RIGHT);
                return;
            }
        });

        setup_ViewPager();
    }

    private void setup_ViewPager() {
        BasePagerAdapter basePagerAdapter = new BasePagerAdapter(this, getSupportFragmentManager());
        view_pager.setAdapter(basePagerAdapter);
        tab_layout.setupWithViewPager(view_pager);
    }

    private boolean isFirstTime() {
        return sharedPreferences.getBoolean("isFirstTime", true);
    }

    private void firstTimeAlert() {
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);
        alertDialog.setMessage("سلام، به مدت 3 روز میتوانید از برنامه به صورت رایگان استفاده نمایید و پس از آن باید اشتراک ماهانه خریداری کنید.");
        alertDialog.setCancelable(false);
        alertDialog.setNeutralButton("باشه", null);
        alertDialog.show();
    }

    private void exitAlert() {
        exitAlert.setCancelable(false);
        exitAlert.setMessage("متاسفانه مهلت استفاده شما از اپلیکیشن به پایان رسیده و باید اشتراک را خریداری کنید");
        exitAlert.setNegativeButton("خروج", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                finish();
            }
        });
        exitAlert.setPositiveButton("خرید اشتراک", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                mHelper.launchPurchaseFlow(MainActivity.this, SKU_SUBSCRIPTION, RC_REQUEST, mPurchaseFinishedListener, "payload-string");
            }
        });
        exitAlert.show();
    }

    IabHelper.QueryInventoryFinishedListener mGotInventoryListener = new IabHelper.QueryInventoryFinishedListener() {
        public void onQueryInventoryFinished(IabResult result, Inventory inventory) {
            Log.d(TAG, "Query inventory finished.");
            if (result.isFailure()) {
                Log.d(TAG, "Failed to query inventory: " + result);
                AlertDialog.Builder internetErrorDialog = new AlertDialog.Builder(MainActivity.this);
                internetErrorDialog.setMessage("لطفا اتصال به اینترنت را برسی کنید و در برنامه کافه بازار وارد حساب کاربری خود شوید");
                internetErrorDialog.show();
                return;
            } else {
                Log.d(TAG, "Query inventory was successful.");
                // does the user have the Subscription?
                isSubscribed = inventory.hasPurchase(SKU_SUBSCRIPTION);
                exitAlert.setCancelable(true);
                // update UI accordingly
                Log.d(TAG, "User is " + (isSubscribed ? "PREMIUM" : "NOT PREMIUM"));
            }
            Log.d(TAG, "Initial inventory query finished; enabling main UI.");
            new TimeAsyncTask().execute();
        }
    };

    IabHelper.OnIabPurchaseFinishedListener mPurchaseFinishedListener = new IabHelper.OnIabPurchaseFinishedListener() {
        public void onIabPurchaseFinished(IabResult result, Purchase purchase) {
            if (result.isFailure()) {
                Log.d(TAG, "Error purchasing: " + result);
                return;
            } else if (purchase.getSku().equals(SKU_SUBSCRIPTION)) {
                // give user access to premium content and update the UI
                Log.d(TAG, "Purchase Success");
                initViews();
            }
        }
    };

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        Log.d(TAG, "onActivityResult(" + requestCode + "," + resultCode + "," + data);
        // Pass on the activity result to the helper for handling
        if (!mHelper.handleActivityResult(requestCode, resultCode, data)) {
            super.onActivityResult(requestCode, resultCode, data);
        } else {
            Log.d(TAG, "onActivityResult handled by IABUtil.");
        }
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        if (mHelper != null) mHelper.dispose();
        mHelper = null;
    }

    private class TimeAsyncTask extends AsyncTask<Void, Void, Long> {
        AlertDialog loadingDialog;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            loadingDialog = new AlertDialog.Builder(MainActivity.this)
                    .setMessage("در حال لود اطلاعات از سرور ...")
                    .setCancelable(false)
                    .show();
        }

        @Override
        protected Long doInBackground(Void... voids) {
            try {
                NTPUDPClient timeClient = new NTPUDPClient();
                InetAddress inetAddress = InetAddress.getByName(TIME_SERVER);
                TimeInfo timeInfo = timeClient.getTime(inetAddress);
                //long returnTime = timeInfo.getReturnTime();   //local device time
                long returnTime = timeInfo.getMessage().getTransmitTimeStamp().getTime();   //server time

                Log.e(TAG, "Time from " + TIME_SERVER + ": " + returnTime);
                return returnTime;
            } catch (IOException e) {
                e.printStackTrace();
                AlertDialog.Builder timeErrorDialog = new AlertDialog.Builder(MainActivity.this);
                timeErrorDialog.setMessage("خطا در لود اطلاعات از سرور");
                timeErrorDialog.setPositiveButton("تلاش مجدد", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        new TimeAsyncTask().execute();
                    }
                });
            }
            return null;
        }

        @Override
        protected void onPostExecute(Long currentTime) {
            super.onPostExecute(currentTime);
            loadingDialog.dismiss();
            sharedPreferences = getSharedPreferences("app", MODE_PRIVATE);
            if (isFirstTime()) {
                firstTimeAlert();
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putBoolean("isFirstTime", false);
                editor.putLong("startTimestamp", currentTime / 1000);
                editor.apply();
                initViews();
            } else if (!isSubscribed) {
                long startTimestamp = sharedPreferences.getLong("startTimestamp", 0);
//            after 3 days in seconds = 3 * 24 Hour * 60 Minutes * 60 Seconds
                if (startTimestamp + 24 * 3 * 60 * 60 < currentTime / 1000) {
                    exitAlert();
                } else {
                    initViews();
                }
            } else {
                initViews();
            }
        }
    }
}
