package com.example.mrlanguagearabic;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class MultimediaFragment extends Fragment {

    private TextView tv_serials ;
    private TextView tv_cartoons ;
    private TextView tv_music ;

    public static MultimediaFragment instance (){

        MultimediaFragment fragment = new MultimediaFragment();
        return fragment;


    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_multimedia,container,false);
        initView(view);
        return view;

    }

    private void initView(View view){

        tv_serials = view.findViewById(R.id.tv_serials);
        tv_cartoons = view.findViewById(R.id.tv_cartoons);
        tv_music = view.findViewById(R.id.tv_music);

        tv_serials.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent tv_serials = new Intent(getActivity(),fragment_multimedia_serials.class);
                startActivity(tv_serials);

            }
        });

        tv_cartoons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent tv_cartoons = new Intent(getActivity(),fragment_multimedia_cartoons.class);
                startActivity(tv_cartoons);

            }
        });

        tv_music.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent tv_music = new Intent(getActivity(),fragment_multimedia_music.class);
                startActivity(tv_music);

            }
        });

}
}