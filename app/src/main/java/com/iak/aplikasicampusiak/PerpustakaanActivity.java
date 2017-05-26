package com.iak.aplikasicampusiak;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Salik on 5/26/2017.
 */

public class PerpustakaanActivity extends Fragment {


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container,  Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.activity_perpustakaan, container, false);

        CardView b1 = (CardView) view.findViewById(R.id.mCardListBuku1);
        CardView b2 = (CardView) view.findViewById(R.id.mCardListBuku2);
        CardView b3 = (CardView) view.findViewById(R.id.mCardListBuku3);
        CardView b4 = (CardView) view.findViewById(R.id.mCardListBuku4);
        CardView b5 = (CardView) view.findViewById(R.id.mCardListBuku5);
        CardView b6 = (CardView) view.findViewById(R.id.mCardListBuku6);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i  = new Intent(getActivity(), DetailBarang.class);
                startActivity(i);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i  = new Intent(getActivity(), DetailBarang.class);
                startActivity(i);
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i  = new Intent(getActivity(), DetailBarang.class);
                startActivity(i);
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i  = new Intent(getActivity(), DetailBarang.class);
                startActivity(i);
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i  = new Intent(getActivity(), DetailBarang.class);
                startActivity(i);
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i  = new Intent(getActivity(), DetailBarang.class);
                startActivity(i);
            }
        });

        return view;
    }
}
