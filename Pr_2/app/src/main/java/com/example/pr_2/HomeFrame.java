package com.example.pr_2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class HomeFrame extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_frame);

    }

    public void buttonClick(View view)
    {
        Intent myIntent = new Intent(HomeFrame.this, MainActivity.class);
        HomeFrame.this.startActivity(myIntent);

    }
}
