package com.example.mrlanguagearabic;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class BasePagerAdapter extends FragmentPagerAdapter {

    private Context context;

    public BasePagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        this.context = context;

    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return GrammerFragment.instance();
            case 1:
                return MultimediaFragment.instance();
            case 2:
                return ExtraFragment.instance();
            default:
                return GrammerFragment.instance();

        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {

        switch (position) {
            case 0:
                return "مکالمه";
            case 1:
                return "چند رسانه ای";
            case 2:
                return "کمک آموزشی";
            default:
                return "مکالمه";

    }


    }
}
