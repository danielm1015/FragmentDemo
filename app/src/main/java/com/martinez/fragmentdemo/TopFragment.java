package com.martinez.fragmentdemo;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 */
public class TopFragment extends Fragment {

    private static EditText topET, bottomET;

    TopSectionListener activityCommander;

    public interface TopSectionListener{
        public void createMeme(String top, String bottom);

    }

    public void onAttach(Context context){
        super.onAttach(context);

        try{
            activityCommander = (TopSectionListener)context;
        }catch(ClassCastException e){
            throw new ClassCastException(context.toString());
        }

    }

    public TopFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_top, container, false);

        //get reference to the widget
        topET = (EditText) view.findViewById(R.id.topET);
        topET = (EditText) view.findViewById(R.id.bottomET);
        final Button button = (Button) view.findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                buttonClick(view);

            }
        });

        return view;
    }

    private void buttonClick(View v){
        activityCommander.createMeme(topET.toString(), bottomET.toString());
    }

}
