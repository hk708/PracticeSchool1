package com.example.assetmanagement;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
   Frag frag;
   FragmentManager manager;
   FragmentTransaction transaction;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        frag= new Frag();
        manager=getSupportFragmentManager();
        transaction=manager.beginTransaction();
        transaction.add(R.id.frame_layout,frag);
        transaction.commit();
    }
}
