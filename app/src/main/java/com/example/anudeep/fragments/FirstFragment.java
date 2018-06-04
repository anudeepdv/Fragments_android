package com.example.anudeep.fragments;


import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class FirstFragment extends Fragment implements View.OnClickListener {

    Button btnfr1 ;
    View v;



    public FirstFragment() {


        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       v= inflater.inflate(R.layout.fragment_blank, container, false);

        btnfr1 = (Button) v.findViewById(R.id.btnfr1);

        btnfr1.setOnClickListener(this);


        return v;

    }

    @Override
    public void onClick(View v) {

        switch (v.getId())
        {
            case R.id.btnfr1 :
                Snackbar.make(v,"hellooo",Snackbar.LENGTH_LONG).show();
               // Toast.makeText(getActivity(),"in fragment 1",Toast.LENGTH_SHORT).show();
                break;

        }

    }
}
