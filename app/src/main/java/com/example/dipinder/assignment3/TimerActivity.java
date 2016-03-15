package com.example.dipinder.assignment3;

/**
 * Created by Dipinder on 3/14/2016.
 */

import android.content.Intent;
import android.os.Bundle;
import android.provider.AlarmClock;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class TimerActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.timerlayout);
    }

    public void starttimer(View view) {
        EditText durationText = (EditText)findViewById(R.id.editText);
        int duration = Integer.parseInt(durationText.getText().toString());

        EditText messageOnScr = (EditText)findViewById(R.id.editText2);
        String message = messageOnScr.getText().toString();

        Intent intent = new Intent(AlarmClock.ACTION_SET_TIMER)
                .putExtra(AlarmClock.EXTRA_MESSAGE, message)
                .putExtra(AlarmClock.EXTRA_LENGTH, duration);


            startActivityForResult(intent, 0);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

    }
}