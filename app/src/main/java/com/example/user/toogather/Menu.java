package com.example.user.toogather;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        Button menuButton = (Button) findViewById(R.id.menu_menu_btn);
        menuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setResult(2);
                finish();
            }
        });

    }

    public void openQA(View v) {
        Intent i = new Intent();
        i.setClass(Menu.this, QuestionAnswer.class);
        startActivity(i);
    }
    public void openKeywords(View v) {
        Intent i = new Intent();
        i.setClass(Menu.this, Keywords.class);
        startActivity(i);
    }
    public void openStats(View v) {
        Intent i = new Intent();
        i.setClass(Menu.this, Stats.class);
        startActivity(i);
    }
    public void openCourseList(View v) {
        Intent i = new Intent();
        i.setClass(Menu.this, CourseList.class);
        startActivity(i);
    }
}


