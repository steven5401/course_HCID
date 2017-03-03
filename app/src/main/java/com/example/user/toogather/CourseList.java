package com.example.user.toogather;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CourseList extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_list);
        Button hcidButton = (Button) findViewById(R.id.hcid_course);
        hcidButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //初始化Intent物件
                Intent intent = new Intent();
                //從MainActivity 到Main2Activity
                intent.setClass(CourseList.this , QuestionAnswer.class);
                //開啟Activity
                startActivity(intent);
            }});
    }
}
