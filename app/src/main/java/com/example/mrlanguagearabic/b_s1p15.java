package com.example.mrlanguagearabic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class b_s1p15 extends AppCompatActivity {

    private TextView tv_s1p15_1 ;
    private TextView tv_s1p15_2 ;
    private TextView tv_s1p15_3 ;
    private TextView tv_s1p15_4 ;
    private TextView tv_s1p15_5 ;
    private TextView tv_s1p15_6 ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.b_s1p15);

        TextView tv_s1p15_1 = findViewById(R.id.tv_s1p15_1);
        TextView tv_s1p15_2 = findViewById(R.id.tv_s1p15_2);
        TextView tv_s1p15_3 = findViewById(R.id.tv_s1p15_3);
        TextView tv_s1p15_4 = findViewById(R.id.tv_s1p15_4);
        TextView tv_s1p15_5 = findViewById(R.id.tv_s1p15_5);
        TextView tv_s1p15_6 = findViewById(R.id.tv_s1p15_6);


        tv_s1p15_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent s1p15_1 = new Intent (b_s1p15.this,b_s1p15_1.class);
                startActivity(s1p15_1);
            }
        });

        tv_s1p15_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent s1p15_2 = new Intent (b_s1p15.this,b_s1p15_2.class);
                startActivity(s1p15_2);
            }
        });
        tv_s1p15_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent s1p15_3 = new Intent (b_s1p15.this,b_s1p15_3.class);
                startActivity(s1p15_3);
            }
        });

        tv_s1p15_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent s1p15_4 = new Intent (b_s1p15.this,b_s1p15_4.class);
                startActivity(s1p15_4);
            }
        });
        tv_s1p15_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent s1p15_5 = new Intent (b_s1p15.this,b_s1p15_5.class);
                startActivity(s1p15_5);
            }
        });
        tv_s1p15_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent s1p15_6 = new Intent (b_s1p15.this,b_s1p15_6.class);
                startActivity(s1p15_6);
            }
        });

    }
}
