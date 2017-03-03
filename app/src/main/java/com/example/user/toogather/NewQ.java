package com.example.user.toogather;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;
import com.example.user.toogather.QuestionAnswer;

public class NewQ extends Activity {
    int count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_q);
    }

    public void newQuestion(View view)
    {
        EditText quesTxt=(EditText)findViewById(R.id.quesText);
        EditText keysTxt=(EditText)findViewById(R.id.keyText);
        Editable ques=quesTxt.getText();

        Intent returnIntent = new Intent();
        returnIntent.putExtra("result",ques.toString());
        setResult(Activity.RESULT_OK,returnIntent);
        finish();
        /*setContentView(R.layout.qamain);
        LinearLayout linearLayout =(LinearLayout)  findViewById(R.id.QuestionList);
        Button btn = new Button(this);
        btn.setText(ques);
        btn.setGravity(Gravity.LEFT);
        linearLayout.addView(btn);
        Toast.makeText(this, "Question added", Toast.LENGTH_LONG).show();
        finish();*/
    }
    public void closeReply(View v){
        finish();
    }
}
