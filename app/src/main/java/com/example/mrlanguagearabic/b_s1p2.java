package com.example.mrlanguagearabic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class b_s1p2 extends AppCompatActivity {

    private TextView tv_s1p2_1 ;
    private TextView tv_s1p2_2 ;
    private TextView tv_s1p2_3 ;
    private TextView tv_s1p2_4 ;
    private TextView tv_s1p2_5 ;
    private TextView tv_s1p2_6 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.b_s1p2);

        TextView tv_s1p2_1 = findViewById(R.id.tv_s1p2_1);
        TextView tv_s1p2_2 = findViewById(R.id.tv_s1p2_2);
        TextView tv_s1p2_3 = findViewById(R.id.tv_s1p2_3);
        TextView tv_s1p2_4 = findViewById(R.id.tv_s1p2_4);
        TextView tv_s1p2_5 = findViewById(R.id.tv_s1p2_5);
        TextView tv_s1p2_6 = findViewById(R.id.tv_s1p2_6);

        tv_s1p2_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent s1p2_1 = new Intent (b_s1p2.this,b_s1p2_1.class);
                startActivity(s1p2_1);
            }
        });

        tv_s1p2_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent s1p2_2 = new Intent (b_s1p2.this,b_s1p2_2.class);
                startActivity(s1p2_2);
            }
        });
        tv_s1p2_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent s1p2_3 = new Intent (b_s1p2.this,b_s1p2_3.class);
                startActivity(s1p2_3);
            }
        });

        tv_s1p2_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent s1p2_4 = new Intent (b_s1p2.this,b_s1p2_4.class);
                startActivity(s1p2_4);
            }
        });
        tv_s1p2_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent s1p2_5 = new Intent (b_s1p2.this,b_s1p2_5.class);
                startActivity(s1p2_5);
            }
        });

        tv_s1p2_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent s1p2_6 = new Intent (b_s1p2.this,b_s1p2_6.class);
                startActivity(s1p2_6);
            }
        });
    }
}
