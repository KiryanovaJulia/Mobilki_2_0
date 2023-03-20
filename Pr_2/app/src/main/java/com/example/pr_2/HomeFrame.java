package com.example.pr_2;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class HomeFrame extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_frame);


      //  TextView text = findViewById(R.id.name);
        Bundle arguments = getIntent().getExtras();

        if(arguments!=null){
            String name = arguments.get("name").toString();
            TextView textView = (TextView)findViewById(R.id.name);
            textView.setText("Name: " + name);
        }

    }


    @Override
    protected void onStart() {
        super.onStart();
      }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    public void buttonClick(View view)
    {
        Intent myIntent = new Intent(HomeFrame.this, MainActivity.class);
        HomeFrame.this.startActivity(myIntent);

    }
}
