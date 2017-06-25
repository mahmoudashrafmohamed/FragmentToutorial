package com.mahmoud_ashraf.fragmentapp;

import android.annotation.SuppressLint;
import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.mahmoud_ashraf.fragmentapp.callback_Interface.Sender;

/**
 * Created by mahmoud_ashraf on 6/25/2017.
 */

//TODO (1) create class MahmoudFragment extends from Fragment

public class MahmoudFragment extends Fragment {

    TextView send;
    //todo add Attach to attach fragment to activity to send data to it
    Sender sender;
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        sender = (Sender)getActivity();
    }





//TODO (2) override for onCreate,  onCreateView, onPause

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toast.makeText(getActivity(),"hello from mahmoud Fragment :)",Toast.LENGTH_LONG).show();
    }
//TODO (3) add this fragment to MainActivity

    //Todo (4) add connect between the MahmoudFragment and its Layout


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_mahmoud_layout,container,false);

        send = (TextView)v.findViewById(R.id.txtv_send);

        return v;
    }

    // After attach we wait to creating activity
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(sender==null){
                    sender = (Sender)getActivity();
                }
                sender.sendMessage("hey man from mahmoud fragment :)");
            }
        });

    }
    //Todo(100) :The last thing is snd date from fragment to another
    /***
     * you have 2 options
     * 1- using callback like in previous way
     * 2- using setArguments like intent in activity
     */
    //Todo(101) we create new fragment called aliFragment
    //Todo (102) edit the method sendMessage
}
