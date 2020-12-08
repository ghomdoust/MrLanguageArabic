package com.example.mrlanguagearabic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class b_s1p16 extends AppCompatActivity {

    private TextView tv_s1p16_1 ;
    private TextView tv_s1p16_2 ;
    private TextView tv_s1p16_3 ;
    private TextView tv_s1p16_4 ;
    private TextView tv_s1p16_5 ;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.b_s1p16);

        TextView tv_s1p16_1 = findViewById(R.id.tv_s1p16_1);
        TextView tv_s1p16_2 = findViewById(R.id.tv_s1p16_2);
        TextView tv_s1p16_3 = findViewById(R.id.tv_s1p16_3);
        TextView tv_s1p16_4 = findViewById(R.id.tv_s1p16_4);
        TextView tv_s1p16_5 = findViewById(R.id.tv_s1p16_5);


        tv_s1p16_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent s1p16_1 = new Intent (b_s1p16.this,b_s1p16_1.class);
                startActivity(s1p16_1);
            }
        });

        tv_s1p16_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent s1p16_2 = new Intent (b_s1p16.this,b_s1p16_2.class);
                startActivity(s1p16_2);
            }
        });
        tv_s1p16_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent s1p16_3 = new Intent (b_s1p16.this,b_s1p16_3.class);
                startActivity(s1p16_3);
            }
        });
        tv_s1p16_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent s1p16_4 = new Intent (b_s1p16.this,b_s1p16_4.class);
                startActivity(s1p16_4);
            }
        });
        tv_s1p16_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent s1p16_5 = new Intent (b_s1p16.this,b_s1p16_5.class);
                startActivity(s1p16_5);
            }
        });


    }
}
