package com.example.mrlanguagearabic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class b_s1p11 extends AppCompatActivity {

    private TextView tv_s1p11_1 ;
    private TextView tv_s1p11_2 ;
    private TextView tv_s1p11_3 ;
    private TextView tv_s1p11_4 ;
    private TextView tv_s1p11_5 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.b_s1p11);

        TextView tv_s1p11_1 = findViewById(R.id.tv_s1p11_1);
        TextView tv_s1p11_2 = findViewById(R.id.tv_s1p11_2);
        TextView tv_s1p11_3 = findViewById(R.id.tv_s1p11_3);
        TextView tv_s1p11_4 = findViewById(R.id.tv_s1p11_4);
        TextView tv_s1p11_5 = findViewById(R.id.tv_s1p11_5);

        tv_s1p11_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent s1p11_1 = new Intent (b_s1p11.this,b_s1p11_1.class);
                startActivity(s1p11_1);
            }
        });

        tv_s1p11_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent s1p11_2 = new Intent (b_s1p11.this,b_s1p11_2.class);
                startActivity(s1p11_2);
            }
        });
        tv_s1p11_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent s1p11_3 = new Intent (b_s1p11.this,b_s1p11_3.class);
                startActivity(s1p11_3);
            }
        });

        tv_s1p11_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent s1p11_4 = new Intent (b_s1p11.this,b_s1p11_4.class);
                startActivity(s1p11_4);
            }
        });
        tv_s1p11_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent s1p11_5 = new Intent (b_s1p11.this,b_s1p11_5.class);
                startActivity(s1p11_5);
            }
        });

    }
}
