package com.mahmoud_ashraf.fragmentapp;

import android.app.Fragment;
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

public class AliFragment extends Fragment {
    TextView textView;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toast.makeText(getActivity(),"hello from Ali Fragment :)",Toast.LENGTH_LONG).show();
    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_ali_layout,container,false);

        textView = (TextView)v.findViewById(R.id.txtv_alifragment);

        return v;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        // set the text coming in arguments
        textView.setText(getArguments().getString("msg"));

    }
}
