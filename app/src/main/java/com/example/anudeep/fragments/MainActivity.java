package com.example.anudeep.fragments;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
     Button btn1 , btn2;
    FrameLayout frame ;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        frame = (FrameLayout) findViewById(R.id.framelayout);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.btn1 :
                FirstFragment first = new FirstFragment();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.framelayout, first);

                transaction.commit();


                break;

            case R.id.btn2 :
                SecondFragment second = new SecondFragment();
                FragmentTransaction transaction1 = getSupportFragmentManager().beginTransaction();
                transaction1.replace(R.id.framelayout,second);
                transaction1.commit();





                break;

        }
    }
}
