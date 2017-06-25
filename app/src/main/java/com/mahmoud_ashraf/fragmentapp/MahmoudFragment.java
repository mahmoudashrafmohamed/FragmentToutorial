package com.mahmoud_ashraf.fragmentapp;

import android.annotation.SuppressLint;
import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

/**
 * Created by mahmoud_ashraf on 6/25/2017.
 */

//TODO (1) create class MahmoudFragment extends from Fragment

public class MahmoudFragment extends Fragment {

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
        return inflater.inflate(R.layout.fragment_mahmoud_layout,container,false);
    }
}
