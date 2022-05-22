package com.example.project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainGame extends AppCompatActivity {

    Button Frag1Button1 = findViewById(R.id.Frag1Button1);
    FragmentManager fragmang = getSupportFragmentManager();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_game);

        Frag1Button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                MoveToFragment2(new Frag2());

            }
        });






    }

    private void MoveToFragment2(Fragment fragment) {

        FragmentTransaction fragtrans = fragmang.beginTransaction();
        fragtrans.replace(R.id.MainGameFragmentContainer, fragment);
        fragtrans.commit();

    }
}