package com.example.pr_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "myLogs";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void buttonClick(View view)
    {
        final EditText login = (EditText)findViewById(R.id.log);
        final EditText password = (EditText)findViewById(R.id.passw);
        if (login.getText().toString().equals("admin") && password.getText().toString().equals("admin"))
            {
                Intent myIntent = new Intent(MainActivity.this, HomeFrame.class);
                MainActivity.this.startActivity(myIntent);
            }
        Log.d(TAG,"Кнопка нажата");
    }

}