package com.example.user.toogather;

import android.app.Activity;
import android.content.Intent;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Keywords extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_keywords);
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        switch(requestCode){
            case 1:
                DrawerLayout mDrawerLayout;
                mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
                mDrawerLayout.closeDrawers();
        }
    }

    public void openYes(View v) {
        //初始化Intent物件
        Intent intent = new Intent();
        //從MainActivity 到Main2Activity
        intent.setClass(Keywords.this, LostRecord.class);
        //開啟Activity
        startActivityForResult(intent, 1);
    }
    public void openNo(View v) {
        DrawerLayout mDrawerLayout;
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        mDrawerLayout.closeDrawers();
    }
    public void openMenu(View v) {
        Intent intent = new Intent();
        intent.setClass(Keywords.this, com.example.user.toogather.Menu.class);
        startActivityForResult(intent, 2);
    }
    public void openEmpathy(View v) {
        Intent intent = new Intent();
        intent.setClass(Keywords.this, EmpathyMap.class);
        startActivityForResult(intent, 2);
    }
    public void openInsight(View v) {
        Intent intent = new Intent();
        intent.setClass(Keywords.this, Insights.class);
        startActivityForResult(intent, 2);
    }
    public void openHMW(View v) {
        Intent intent = new Intent();
        intent.setClass(Keywords.this, HowMightWe.class);
        startActivityForResult(intent, 2);
    }
    public void openPrototype(View v) {
        Intent intent = new Intent();
        intent.setClass(Keywords.this, Prototype.class);
        startActivityForResult(intent, 2);
    }

}
