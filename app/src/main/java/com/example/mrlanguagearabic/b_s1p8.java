package com.example.mrlanguagearabic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class b_s1p8 extends AppCompatActivity {

    private TextView tv_s1p7_1 ;
    private TextView tv_s1p7_2 ;
    private TextView tv_s1p7_3 ;
    private TextView tv_s1p7_4 ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.b_s1p8);

        TextView tv_s1p8_1 = findViewById(R.id.tv_s1p8_1);
        TextView tv_s1p8_2 = findViewById(R.id.tv_s1p8_2);
        TextView tv_s1p8_3 = findViewById(R.id.tv_s1p8_3);
        TextView tv_s1p8_4 = findViewById(R.id.tv_s1p8_4);


        tv_s1p8_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent s1p8_1 = new Intent (b_s1p8.this,b_s1p8_1.class);
                startActivity(s1p8_1);
            }
        });

        tv_s1p8_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent s1p8_2 = new Intent (b_s1p8.this,b_s1p8_2.class);
                startActivity(s1p8_2);
            }
        });
        tv_s1p8_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent s1p8_3 = new Intent (b_s1p8.this,b_s1p8_3.class);
                startActivity(s1p8_3);
            }
        });

        tv_s1p8_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent s1p8_4 = new Intent (b_s1p8.this,b_s1p8_4.class);
                startActivity(s1p8_4);
            }
        });

    }
}
