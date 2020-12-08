package com.example.mrlanguagearabic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class c_serials_2 extends AppCompatActivity {

    private TextView tv_s2p2_1 ;
    private TextView tv_s2p2_2 ;
    private TextView tv_s2p2_3 ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.c_serials_2);

        TextView tv_s2p2_1 = findViewById(R.id.tv_s2p2_1);
        TextView tv_s2p2_2 = findViewById(R.id.tv_s2p2_2);
        TextView tv_s2p2_3 = findViewById(R.id.tv_s2p2_3);


        tv_s2p2_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tv_s2p2_1 = new Intent (c_serials_2.this,c_serials_2_1.class);
                startActivity(tv_s2p2_1);
            }
        });

        tv_s2p2_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tv_s2p2_2 = new Intent (c_serials_2.this,c_serials_2_2.class);
                startActivity(tv_s2p2_2);
            }
        });

        tv_s2p2_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tv_s2p2_3 = new Intent (c_serials_2.this,c_serials_2_3.class);
                startActivity(tv_s2p2_3);
            }
        });



    }
}