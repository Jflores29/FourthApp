package com.javier.fourthapp;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class SecondActivity extends AppCompatActivity implements GreenFragment.MyCallback {

    private static final String TAG ="BackPress_" ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);



    }

    public void greenMagic(View view) {
        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.a_second_2nd, new GreenFragment(), "Green_TAG_FRAGMENT")
                .addToBackStack(null)
                .commit();
    }
    public void removeMagic(View view) {
        Fragment fragment = getSupportFragmentManager()
                .findFragmentByTag("RED_TAG_FRAGMENT");

        getSupportFragmentManager()
                .beginTransaction()
                .remove(fragment)
                .commit();
    }

    public void redMagic(View view) {
        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.a_second_first, new RedFragment(), "Red_TAG_FRAGMENT")
                .addToBackStack(null)
                .commit();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();

        Log.d(TAG, "onBackPressed: ");

    }

    @Override
    public void someoneClicked(String message) {
        RedFragment redFragment
                = (RedFragment) getSupportFragmentManager()
                .findFragmentByTag("RedFragmentTAG_");

        redFragment.updateText(message);

        //Log.d(TAG, "someoneClicked: " + message);
    }
}
