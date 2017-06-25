package com.mahmoud_ashraf.fragmentapp;

import android.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.mahmoud_ashraf.fragmentapp.callback_Interface.Sender;

public class MainActivity extends AppCompatActivity implements Sender {
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

    @Override
    public void sendMessage(String message) {
      //  Toast.makeText(MainActivity.this,message,Toast.LENGTH_SHORT).show();
        AliFragment fragment = new AliFragment();
        Bundle args = new Bundle();
        args.putString("msg",message);
        fragment.setArguments(args);

        getFragmentManager().
                beginTransaction().
                add(R.id.activity_main,fragment)
                .commit();


    }
    //TODO (4) Create layout for fragment
}
