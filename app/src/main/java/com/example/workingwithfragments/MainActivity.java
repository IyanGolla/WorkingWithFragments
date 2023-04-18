package com.example.workingwithfragments;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Fragment;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    Fragment_A a;

    Fragment_B b;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        a = new Fragment_A();
        b = new Fragment_B();
        getSupportFragmentManager().beginTransaction().replace(R.id.placefora,a).replace(R.id.placeforb,b).commit();

    }
}