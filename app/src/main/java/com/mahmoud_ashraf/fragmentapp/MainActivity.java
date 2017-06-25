package com.mahmoud_ashraf.fragmentapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // todo Adding the fragment here
        getFragmentManager().
                beginTransaction().
              //  add(new MahmoudFragment(),"mah")
                //todo (5) we change this line to add the container that contains our fragment
                        add(R.id.activity_main,new MahmoudFragment(),"mah")
                .commit();
    }
    //TODO (4) Create layout for fragment
}
