package com.way.samplegeneapp;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.gene.GeneApp;
import com.gene.GeneListeners.GeneDataCallbacks;

public class MainActivity extends AppCompatActivity implements GeneDataCallbacks {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       //Replace with your keys
        GeneApp.initialize(MainActivity.this, "YOUR_API_KEY",  "USER_GOOGLE_ADVERTISER_ID");
        GeneApp.start("testing transaction");
        GeneApp.age("26", "number");
        GeneApp.gender("male", "String");
        GeneApp.locationCity("hyderabad", "String");
        GeneApp.locationState("telengana", "String");
        GeneApp.locationCountry("India", "String");
        GeneApp.zipcode("500090", "number");
        GeneApp.addtrait("from", "hyderabad", "string");
        GeneApp.addtrait("to", "vijayawada", "string");
        GeneApp.addtrait("b_date", "30-05-2019", "date");
        GeneApp.addtrait("b_time", "123123123", "number");
        GeneApp.send();
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
