package com.example.mrlanguagearabic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class c_cartoons_1 extends AppCompatActivity {

    private TextView tv_s2p2_1 ;
    private TextView tv_s2p2_2 ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.c_cartoons_1);

        TextView tv_s2p2_1 = findViewById(R.id.tv_s2p2_1);
        TextView tv_s2p2_2 = findViewById(R.id.tv_s2p2_2);


        tv_s2p2_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tv_s2p2_1 = new Intent (c_cartoons_1.this,c_cartoons_1_1.class);
                startActivity(tv_s2p2_1);
            }
        });

        tv_s2p2_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tv_s2p2_2 = new Intent (c_cartoons_1.this,c_cartoons_1_2.class);
                startActivity(tv_s2p2_2);
            }
        });


    }
}