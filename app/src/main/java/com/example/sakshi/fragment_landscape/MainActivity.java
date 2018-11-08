package com.example.sakshi.fragment_landscape;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements Fragment1.OnFragmentInteractionListener{
    Button button1, button2, button3, button4;
    Fragment fragment;  //declaring 4 buttons and one fragment
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1=(Button)findViewById(R.id.layout1);
        button2=(Button)findViewById(R.id.layout2);
        button3=(Button)findViewById(R.id.layout3);
        button4=(Button)findViewById(R.id.layout4); //associating buttons with their respective ids

        //on click listener for button one
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //creating object for fragment 1
                fragment = new Fragment1();
                //fragment manager handles transition between fragments
                //Returns the FragmentManager for interacting with fragments associated with this activity.
                FragmentManager fragmentManager = getFragmentManager();
                //begins transaction
                //performs edit operations on fragment associated with the fragment  manager
                FragmentTransaction transaction = fragmentManager.beginTransaction();
                //replacing fragment
                transaction.replace(R.id.frag,fragment);
                //committing changes
                transaction.commit();


            }
        });
        //on click listener for button 2
       button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //creating object for fragment2
                fragment = new Fragment2();
                //fragment manager handles transition between fragments
                //Returns the FragmentManager for interacting with fragments associated with this activity.
                FragmentManager fragmentManager = getFragmentManager();
                //begins transaction
                //performs edit operations on fragment associated with the fragment  manager
                FragmentTransaction transaction = fragmentManager.beginTransaction();
                //replacing fragment
                transaction.replace(R.id.frag,fragment);
                //committing changes
                transaction.commit();

            }
        });
        //on click listener for button 3
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //creating object for fragment 3
                fragment = new Fragment3();
                //fragment manager handles transition between fragments
                //Returns the FragmentManager for interacting with fragments associated with this activity.
                FragmentManager fragmentManager = getFragmentManager();
                //begins transaction
                //performs edit operations on fragment associated with the fragment  manager
                FragmentTransaction transaction = fragmentManager.beginTransaction();
                //replacing fragment
                transaction.replace(R.id.frag,fragment);
                //committing changes
                transaction.commit();

            }
        });
        //on click listener for button 4
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //creating object for fragment 4
                fragment = new Fragment4();
                //fragment manager handles transition between fragments
                //Returns the FragmentManager for interacting with fragments associated with this activity.
                FragmentManager fragmentManager = getFragmentManager();
                //begins transaction
                //performs edit operations on fragment associated with the fragment  manager
                FragmentTransaction transaction = fragmentManager.beginTransaction();
                //replacing fragment
                transaction.replace(R.id.frag,fragment);
                //committing changes
                transaction.commit();
            }
        });
    }

    @Override
    public void onFragmentInteraction(Uri uri) {
        
    }
}
