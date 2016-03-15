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

public class AlarmActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.alarmlayout);
    }

    public void startalarm(View view) {
        EditText hourText = (EditText)findViewById(R.id.editText3);
        int hour = Integer.parseInt(hourText.getText().toString());

        EditText minutesText = (EditText)findViewById(R.id.editText4);
        int minutes = Integer.parseInt(minutesText.getText().toString());

        EditText messageAlarm = (EditText)findViewById(R.id.editText5);
        String message = messageAlarm.getText().toString();

        Intent intent = new Intent(AlarmClock.ACTION_SET_ALARM)
                .putExtra(AlarmClock.EXTRA_MESSAGE, message)
                .putExtra(AlarmClock.EXTRA_HOUR, hour)
                .putExtra(AlarmClock.EXTRA_MINUTES, minutes);


            startActivityForResult(intent, 1);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
    }
}