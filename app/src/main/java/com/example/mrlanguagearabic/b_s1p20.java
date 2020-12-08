package com.example.mrlanguagearabic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class b_s1p20 extends AppCompatActivity {

    private TextView tv_s1p20_1 ;
    private TextView tv_s1p20_2 ;
    private TextView tv_s1p20_3 ;
    private TextView tv_s1p20_4 ;
    private TextView tv_s1p20_5 ;
    private TextView tv_s1p20_6 ;
    private TextView tv_s1p20_7 ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.b_s1p20);

        TextView tv_s1p20_1 = findViewById(R.id.tv_s1p20_1);
        TextView tv_s1p20_2 = findViewById(R.id.tv_s1p20_2);
        TextView tv_s1p20_3 = findViewById(R.id.tv_s1p20_3);
        TextView tv_s1p20_4 = findViewById(R.id.tv_s1p20_4);
        TextView tv_s1p20_5 = findViewById(R.id.tv_s1p20_5);
        TextView tv_s1p20_6 = findViewById(R.id.tv_s1p20_6);
        TextView tv_s1p20_7 = findViewById(R.id.tv_s1p20_7);

        tv_s1p20_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent s1p20_1 = new Intent (b_s1p20.this,b_s1p20_1.class);
                startActivity(s1p20_1);
            }
        });

        tv_s1p20_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent s1p20_2 = new Intent (b_s1p20.this,b_s1p20_2.class);
                startActivity(s1p20_2);
            }
        });
        tv_s1p20_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent s1p20_3 = new Intent (b_s1p20.this,b_s1p20_3.class);
                startActivity(s1p20_3);
            }
        });
        tv_s1p20_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent s1p20_4 = new Intent (b_s1p20.this,b_s1p20_4.class);
                startActivity(s1p20_4);
            }
        });
        tv_s1p20_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent s1p20_5 = new Intent (b_s1p20.this,b_s1p20_5.class);
                startActivity(s1p20_5);
            }
        });
        tv_s1p20_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent s1p20_6 = new Intent (b_s1p20.this,b_s1p20_6.class);
                startActivity(s1p20_6);
            }
        });
        tv_s1p20_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent s1p20_7 = new Intent (b_s1p20.this,b_s1p20_7.class);
                startActivity(s1p20_7);
            }
        });


    }
}
