package com.mahmoud_ashraf.fragmentapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button rep;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rep = (Button)findViewById(R.id.btn);
        rep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getFragmentManager().
                        beginTransaction().
                        replace(R.id.activity_main,new testFragment(),"test")
                        .commit();
            }
        });

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
