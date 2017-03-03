package com.example.user.toogather;

import android.app.Activity;
import android.content.Intent;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class QuestionAnswer extends Activity {
    private int count=0;
    static final int NEW_QUESTION = 100;
    static final int PRESS_NO = 1;
    static final int REPLY = 2;
    static int mymargin = 0;
    static Button[] btnWord = new Button[100];
    static int i = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_answer);
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        switch(requestCode){
            case PRESS_NO:
                DrawerLayout mDrawerLayout;
                mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
                mDrawerLayout.closeDrawers();
            case NEW_QUESTION:
                if(resultCode == Activity.RESULT_OK){
                    String result=data.getStringExtra("result");
                    postQuestion(result);
                }
                if (resultCode == Activity.RESULT_CANCELED) {
                    //Write your code if there's no result
                }
        }
    }

    public void openYes(View v) {
        //初始化Intent物件
        Intent intent = new Intent();
        //從MainActivity 到Main2Activity
        intent.setClass(QuestionAnswer.this, LostRecord.class);
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
        intent.setClass(QuestionAnswer.this, com.example.user.toogather.Menu.class);
        startActivityForResult(intent, 2);
    }
    public void onClickBtn(View v)
    {
        Intent i = new Intent(this,NewQ.class);
        startActivityForResult(i,NEW_QUESTION);
        /*count++;
        LinearLayout linearLayout =(LinearLayout)  findViewById(R.id.QuestionList);
        Button btn = new Button(this);
        btn.setText(Integer.toString(count));
        btn.setGravity(Gravity.LEFT);
        linearLayout.addView(btn);
        */
//        Toast.makeText(this, "Clicked on Button", Toast.LENGTH_LONG).show();
    }
    public void openReply(View v) {
        Intent i = new Intent(QuestionAnswer.this, replyPage.class);
        Button noButton = (Button) findViewById(v.getId());
        i.putExtra("question", noButton.getText().toString());
        startActivityForResult(i, REPLY);
    }
    public void postQuestion(final String ques)
    {
        //setContentView(R.layout.qamain);
        LinearLayout linearLayout =(LinearLayout)  findViewById(R.id.QuestionList);
        LinearLayout.LayoutParams  btn_para = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        btn_para.setMargins(0,10, 0, 0);
        btnWord[i] = new Button(this);
        btnWord[i].setText(ques);
        btnWord[i].setGravity(Gravity.LEFT);
        btnWord[i].setAllCaps(false);
        btnWord[i].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(QuestionAnswer.this, replyPage.class);
                Button noButton = (Button) findViewById(v.getId());
                i.putExtra("question", ques);
                startActivity(i);
            }
        });
        btnWord[i].setLayoutParams(btn_para);
        linearLayout.addView(btnWord[i]);
        //mymargin = mymargin + 50;
        i = i + 1;
        Toast.makeText(this, "Question added", Toast.LENGTH_LONG).show();
    }
}
