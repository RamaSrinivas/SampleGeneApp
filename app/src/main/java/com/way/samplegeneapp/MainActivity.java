package com.way.samplegeneapp;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements GeneDataCallbacks{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       //Replace with your keys
        GeneApp.initialize(MainActivity.this, "YOUR_API_KEY", "YOUR_TRANSACTION_NAME", "USER_GOOGLE_ADVERTISER_ID", "USER_DETAILS", "USER_TRAITS");
    }

    @Override
    public void onDataSuccess(String message, String data) {
        Log.i("onDataSuccess",""+data);
        Toast.makeText(this,message.toString(),2000).show();

    }

    @Override
    public void onDataFailure(String message) {
        Log.i("onDataFailure",""+message);
        Toast.makeText(this,message.toString(),2000).show();
    }
}
