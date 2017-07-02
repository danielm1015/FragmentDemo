package com.martinez.fragmentdemo;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class BottomFragment extends Fragment {

    private static TextView topTV, bottomTV;


    public BottomFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_bottom, container, false);

        //get reference to the widget
        topTV = (TextView) view.findViewById(R.id.topTV);
        bottomTV = (TextView) view.findViewById(R.id.bottomTV);

        return view;
    }

    public void setMemeText(String top, String bottom){
        topTV.setText(top);
        bottomTV.setText(bottom);
    }

}
