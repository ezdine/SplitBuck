package com.example.rohitanil.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements topsection_fragment.TopSectionListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    @Override
    public void splitBill(String bill, String guest) {


        float split= Float.parseFloat ( bill )/Float.parseFloat ( guest );
        bottomsection_fragment bottomFragment=(bottomsection_fragment)getSupportFragmentManager ().findFragmentById ( R.id.fragment2 );
        bottomFragment.setAmt(String.format("%.2f", split));
    }
public void clearBill()
{
    bottomsection_fragment bottomFragment=(bottomsection_fragment)getSupportFragmentManager ().findFragmentById ( R.id.fragment2 );
    bottomFragment.setAmt ( "00.00" );
}
}
