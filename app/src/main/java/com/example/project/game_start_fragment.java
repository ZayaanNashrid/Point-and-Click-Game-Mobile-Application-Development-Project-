package com.example.project;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link game_start_fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class game_start_fragment extends Fragment implements View.OnClickListener {

    View view;
    Button Frag1Button1;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_game_start_fragment, container, false);
        Frag1Button1 = (Button) view.findViewById(R.id.Frag1Button1);
        Frag1Button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //MoveToFragment2();
            }
        });
        return view;
    }

    @Override
    public void onClick(View view) {

    }


}