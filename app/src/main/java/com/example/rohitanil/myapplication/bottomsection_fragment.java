package com.example.rohitanil.myapplication;

/**
 * Created by ROHIT ANIL on 27-12-2016.
 */
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class bottomsection_fragment extends Fragment {

    private static TextView split_amt;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate ( R.layout.bottom_section_fragment, container, false );
        split_amt = (TextView) view.findViewById ( R.id.split_amt );
        return view;
    }

    public void setAmt(String amount){
        split_amt.setText ( amount );
    }

}