package com.example.mrlanguagearabic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class b_s1p7 extends AppCompatActivity {

    private TextView tv_s1p7_1 ;
    private TextView tv_s1p7_2 ;
    private TextView tv_s1p7_3 ;
    private TextView tv_s1p7_4 ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.b_s1p7);

        TextView tv_s1p7_1 = findViewById(R.id.tv_s1p7_1);
        TextView tv_s1p7_2 = findViewById(R.id.tv_s1p7_2);
        TextView tv_s1p7_3 = findViewById(R.id.tv_s1p7_3);
        TextView tv_s1p7_4 = findViewById(R.id.tv_s1p7_4);


        tv_s1p7_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent s1p7_1 = new Intent (b_s1p7.this,b_s1p7_1.class);
                startActivity(s1p7_1);
            }
        });

        tv_s1p7_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent s1p7_2 = new Intent (b_s1p7.this,b_s1p7_2.class);
                startActivity(s1p7_2);
            }
        });
        tv_s1p7_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent s1p7_3 = new Intent (b_s1p7.this,b_s1p7_3.class);
                startActivity(s1p7_3);
            }
        });

        tv_s1p7_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent s1p7_4 = new Intent (b_s1p7.this,b_s1p7_4.class);
                startActivity(s1p7_4);
            }
        });

    }
}
