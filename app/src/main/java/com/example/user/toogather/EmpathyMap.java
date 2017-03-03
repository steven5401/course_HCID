package com.example.user.toogather;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class EmpathyMap extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_empathy_map);
    }
    public void openKeywords(View v) {
        Intent i = new Intent();
        i.setClass(EmpathyMap.this, Keywords.class);
        startActivity(i);
    }
}
