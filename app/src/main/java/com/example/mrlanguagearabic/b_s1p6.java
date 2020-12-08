package com.example.mrlanguagearabic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class b_s1p6 extends AppCompatActivity {

    private TextView tv_s1p6_1 ;
    private TextView tv_s1p6_2 ;
    private TextView tv_s1p6_3 ;
    private TextView tv_s1p6_4 ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.b_s1p6);

        TextView tv_s1p6_1 = findViewById(R.id.tv_s1p6_1);
        TextView tv_s1p6_2 = findViewById(R.id.tv_s1p6_2);
        TextView tv_s1p6_3 = findViewById(R.id.tv_s1p6_3);
        TextView tv_s1p6_4 = findViewById(R.id.tv_s1p6_4);


        tv_s1p6_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent s1p6_1 = new Intent (b_s1p6.this,b_s1p6_1.class);
                startActivity(s1p6_1);
            }
        });

        tv_s1p6_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent s1p6_2 = new Intent (b_s1p6.this,b_s1p6_2.class);
                startActivity(s1p6_2);
            }
        });
        tv_s1p6_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent s1p6_3 = new Intent (b_s1p6.this,b_s1p6_3.class);
                startActivity(s1p6_3);
            }
        });

        tv_s1p6_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent s1p6_4 = new Intent (b_s1p6.this,b_s1p6_4.class);
                startActivity(s1p6_4);
            }
        });

    }
}
