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
import android.app.Activity;
import android.widget.Button;
import android.widget.EditText;

public class topsection_fragment extends Fragment {
    private static EditText topBillAmount;
    private static EditText totalGuest;

    TopSectionListener activityCommander;
    public interface  TopSectionListener{
        public void splitBill(String bill,String guest);
        public void clearBill();
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach ( activity );
        try{
            activityCommander=(TopSectionListener) activity;
        }catch (ClassCastException e)
        {
            throw new ClassCastException (activity.toString ());
        }
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.top_section_layout,container,false);
        topBillAmount=(EditText)view.findViewById(R.id.topBillAmount);
        totalGuest=(EditText)view.findViewById(R.id.totalGuest);
        final Button splitButton=(Button)view.findViewById(R.id.split_button);
        splitButton.setOnClickListener(
            new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    buttonClicked(v);

                }
            }
        );

        //implement clear text fields
        final Button clearbutton=(Button)view.findViewById(R.id.clear_button);
        clearbutton.setOnClickListener (
                new View.OnClickListener () {
                    @Override
                    public void onClick(View v) {
                        topBillAmount.setText ("");
                        totalGuest.setText ("");
                        activityCommander.clearBill ();

                    }
                }
        );

        return view;
    }
    //button clicked
    public void buttonClicked(View view)
    {
        if((topBillAmount.getText ().length ()==0)||(totalGuest.getText ().length ()==0))
        {

        }
        else {
            activityCommander.splitBill ( topBillAmount.getText ().toString (), totalGuest.getText ().toString () );
        }
        }


}
