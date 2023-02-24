package com.example.pr_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void buttonClick(View view)
    {
        view.findViewById(R.id.sign_in).setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, HomeFrame.class);
            startActivity(intent);
        });

    }

}