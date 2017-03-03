package com.example.user.toogather;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class replyPage extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reply_page);
        Intent i = getIntent();
        String s = i.getStringExtra("question");
        Button btn = (Button) findViewById(R.id.q);
        btn.setText(s);
    }

    public void closeReply(View v){
        finish();
    }

    public void addComment(View v){
        EditText commentTxt=(EditText)findViewById(R.id.commentTxt);
        TextView line = new TextView(this);
        line.setBackgroundColor(Color.parseColor("#000000"));
        LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,1);
        lp.setMargins(0,10,0,10);
        LinearLayout.LayoutParams lp2 = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        lp.setMargins(0,10,0,10);
        line.setLayoutParams(lp);
        TextView tv = new TextView(this);
        tv.setText(commentTxt.getText());
        tv.setTextSize(18);
        tv.setGravity(Gravity.LEFT);
        tv.setLayoutParams(lp2);
        LinearLayout linearLayout =(LinearLayout)  findViewById(R.id.replyList);
        linearLayout.addView(line);
        linearLayout.addView(tv);
    }
}
