package com.example.mrlanguagearabic;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class ExtraFragment extends Fragment {

    private TextView tv_translator ;
    private TextView tv_dictionary ;



    public static ExtraFragment instance (){

        ExtraFragment fragment = new ExtraFragment();
        return fragment;
        

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_extra,container,false);
        initView(view);
        return view;

    }

    private void initView(View view){

        tv_translator = view.findViewById(R.id.tv_translator);
        tv_dictionary = view.findViewById(R.id.tv_dictionary);


        tv_translator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent tv_translator = new Intent(getActivity(),translator.class);
                startActivity(tv_translator);

            }
        });

        tv_dictionary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getActivity(),"در بروزرسانی بعدی فعال می گردد", Toast.LENGTH_LONG).show();

            }
        });



    }
}
