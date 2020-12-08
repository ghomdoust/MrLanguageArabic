package com.example.mrlanguagearabic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class fragment_multimedia_serials extends AppCompatActivity {


    private TextView tv_s2p1 ;
    private TextView tv_s2p2 ;
    private TextView tv_s2p3 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_multimedia_serials);

        TextView tv_s2p1 = findViewById(R.id.tv_s2p1);
        TextView tv_s2p2 = findViewById(R.id.tv_s2p2);
        TextView tv_s2p3 = findViewById(R.id.tv_s2p3);


        tv_s2p1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tv_s2p1 = new Intent (fragment_multimedia_serials.this,c_serials_1.class);
                startActivity(tv_s2p1);
            }
        });

        tv_s2p2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tv_s2p2 = new Intent (fragment_multimedia_serials.this,c_serials_2.class);
                startActivity(tv_s2p2);
            }
        });

        tv_s2p3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tv_s2p3 = new Intent (fragment_multimedia_serials.this,c_serials_3.class);
                startActivity(tv_s2p3);
            }
        });


    }
}
