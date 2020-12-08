package com.example.mrlanguagearabic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class c_serials_1 extends AppCompatActivity {

    private TextView tv_s2p1_1 ;
    private TextView tv_s2p1_2 ;
    private TextView tv_s2p1_3 ;
    private TextView tv_s2p1_4 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.c_serials_1);

        TextView tv_s2p1_1 = findViewById(R.id.tv_s2p1_1);
        TextView tv_s2p1_2 = findViewById(R.id.tv_s2p1_2);
        TextView tv_s2p1_3 = findViewById(R.id.tv_s2p1_3);
        TextView tv_s2p1_4 = findViewById(R.id.tv_s2p1_4);

        tv_s2p1_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tv_s2p1_1 = new Intent (c_serials_1.this,c_serials_1_1.class);
                startActivity(tv_s2p1_1);
            }
        });

        tv_s2p1_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tv_s2p1_2 = new Intent (c_serials_1.this,c_serials_1_2.class);
                startActivity(tv_s2p1_2);
            }
        });

        tv_s2p1_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tv_s2p1_3 = new Intent (c_serials_1.this,c_serials_1_3.class);
                startActivity(tv_s2p1_3);
            }
        });

        tv_s2p1_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tv_s2p1_4 = new Intent (c_serials_1.this,c_serials_1_4.class);
                startActivity(tv_s2p1_4);
            }
        });

    }
}