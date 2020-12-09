package com.example.mrlanguagearabic;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

public class GrammerFragment extends Fragment {

    private TextView tv_s1p0 ;
    private TextView tv_s1p1 ;
    private TextView tv_s1p2 ;
    private TextView tv_s1p3 ;
    private TextView tv_s1p4 ;
    private TextView tv_s1p5 ;
    private TextView tv_s1p6 ;
    private TextView tv_s1p7 ;
    private TextView tv_s1p8 ;
    private TextView tv_s1p9 ;
    private TextView tv_s1p10 ;
    private TextView tv_s1p11 ;
    private TextView tv_s1p12 ;
    private TextView tv_s1p13 ;
    private TextView tv_s1p14 ;
    private TextView tv_s1p15 ;
    private TextView tv_s1p16 ;
    private TextView tv_s1p17 ;
    private TextView tv_s1p18 ;
    private TextView tv_s1p19 ;
    private TextView tv_s1p20 ;
    private TextView tv_s1p21 ;
    



    public static GrammerFragment instance (){

        GrammerFragment fragment = new GrammerFragment();
        return fragment;

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)

    {
        View view = inflater.inflate(R.layout.fragment_grammer,container,false);

        initView(view);

        return view;

    }

    private void initView(View view){

        tv_s1p0 = view.findViewById(R.id.tv_s1p0);
        tv_s1p1 = view.findViewById(R.id.tv_s1p1);
        tv_s1p2 = view.findViewById(R.id.tv_s1p2);
        tv_s1p3 = view.findViewById(R.id.tv_s1p3);
        tv_s1p4 = view.findViewById(R.id.tv_s1p4);
        tv_s1p5 = view.findViewById(R.id.tv_s1p5);
        tv_s1p6 = view.findViewById(R.id.tv_s1p6);
        tv_s1p7 = view.findViewById(R.id.tv_s1p7);
        tv_s1p8 = view.findViewById(R.id.tv_s1p8);
        tv_s1p9 = view.findViewById(R.id.tv_s1p9);
        tv_s1p10 = view.findViewById(R.id.tv_s1p10);
        tv_s1p11 = view.findViewById(R.id.tv_s1p11);
        tv_s1p12 = view.findViewById(R.id.tv_s1p12);
        tv_s1p13 = view.findViewById(R.id.tv_s1p13);
        tv_s1p14 = view.findViewById(R.id.tv_s1p14);
        tv_s1p15 = view.findViewById(R.id.tv_s1p15);
        tv_s1p16 = view.findViewById(R.id.tv_s1p16);
        tv_s1p17 = view.findViewById(R.id.tv_s1p17);
        tv_s1p18 = view.findViewById(R.id.tv_s1p18);
        tv_s1p19 = view.findViewById(R.id.tv_s1p19);
        tv_s1p20 = view.findViewById(R.id.tv_s1p20);
        tv_s1p21 = view.findViewById(R.id.tv_s1p21);


        tv_s1p0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent s1p0 = new Intent(getActivity(),b_s1p0.class);
                startActivity(s1p0);

            }
        });

        tv_s1p1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent s1p1 = new Intent(getActivity(),b_s1p1.class);
                startActivity(s1p1);

            }
        });

        tv_s1p2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent s1p2 = new Intent(getActivity(),b_s1p2.class);
                startActivity(s1p2);

            }
        });

        tv_s1p3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent s1p3 = new Intent(getActivity(),b_s1p3.class);
                startActivity(s1p3);

            }
        });


        tv_s1p4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent s1p4 = new Intent(getActivity(),b_s1p4.class);
                startActivity(s1p4);

            }
        });

        tv_s1p5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent s1p5 = new Intent(getActivity(),b_s1p5.class);
                startActivity(s1p5);

            }
        });

        tv_s1p6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent s1p6 = new Intent(getActivity(),b_s1p6.class);
                startActivity(s1p6);

            }
        });

        tv_s1p7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent s1p7 = new Intent(getActivity(),b_s1p7.class);
                startActivity(s1p7);

            }
        });

        tv_s1p8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent s1p8 = new Intent(getActivity(),b_s1p8.class);
                startActivity(s1p8);

            }
        });

        tv_s1p9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent s1p9 = new Intent(getActivity(),b_s1p9.class);
                startActivity(s1p9);

            }
        });

        tv_s1p10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent s1p10 = new Intent(getActivity(),b_s1p10.class);
                startActivity(s1p10);

            }
        });

        tv_s1p11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent s1p11 = new Intent(getActivity(),b_s1p11.class);
                startActivity(s1p11);

            }
        });

        tv_s1p12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent s1p12 = new Intent(getActivity(),b_s1p12.class);
                startActivity(s1p12);

            }
        });

        tv_s1p13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent s1p13 = new Intent(getActivity(),b_s1p13.class);
                startActivity(s1p13);

            }
        });

        tv_s1p14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent s1p14 = new Intent(getActivity(),b_s1p14.class);
                startActivity(s1p14);

            }
        });

        tv_s1p15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent s1p15 = new Intent(getActivity(),b_s1p15.class);
                startActivity(s1p15);

            }
        });

        tv_s1p16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent s1p16 = new Intent(getActivity(),b_s1p16.class);
                startActivity(s1p16);

            }
        });

        tv_s1p17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent s1p17 = new Intent(getActivity(),b_s1p17.class);
                startActivity(s1p17);

            }
        });

        tv_s1p18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent s1p18 = new Intent(getActivity(),b_s1p18.class);
                startActivity(s1p18);

            }
        });

        tv_s1p19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent s1p19 = new Intent(getActivity(),b_s1p19.class);
                startActivity(s1p19);

            }
        });

        tv_s1p20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent s1p20 = new Intent(getActivity(),b_s1p20.class);
                startActivity(s1p20);

            }
        });

        tv_s1p21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent s1p21 = new Intent(getActivity(),b_s1p21.class);
                startActivity(s1p21);

            }
        });

    }

}
