package com.example.mrlanguagearabic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class b_s1p19 extends AppCompatActivity {

    private TextView tv_s1p19_1 ;
    private TextView tv_s1p19_2 ;
    private TextView tv_s1p19_3 ;
    private TextView tv_s1p19_4 ;
    private TextView tv_s1p19_5 ;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.b_s1p19);

        TextView tv_s1p19_1 = findViewById(R.id.tv_s1p19_1);
        TextView tv_s1p19_2 = findViewById(R.id.tv_s1p19_2);
        TextView tv_s1p19_3 = findViewById(R.id.tv_s1p19_3);
        TextView tv_s1p19_4 = findViewById(R.id.tv_s1p19_4);
        TextView tv_s1p19_5 = findViewById(R.id.tv_s1p19_5);


        tv_s1p19_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent s1p19_1 = new Intent (b_s1p19.this,b_s1p19_1.class);
                startActivity(s1p19_1);
            }
        });

        tv_s1p19_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent s1p19_2 = new Intent (b_s1p19.this,b_s1p19_2.class);
                startActivity(s1p19_2);
            }
        });
        tv_s1p19_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent s1p19_3 = new Intent (b_s1p19.this,b_s1p19_3.class);
                startActivity(s1p19_3);
            }
        });
        tv_s1p19_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent s1p19_4 = new Intent (b_s1p19.this,b_s1p19_4.class);
                startActivity(s1p19_4);
            }
        });
        tv_s1p19_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent s1p19_5 = new Intent (b_s1p19.this,b_s1p19_5.class);
                startActivity(s1p19_5);
            }
        });


    }
}
