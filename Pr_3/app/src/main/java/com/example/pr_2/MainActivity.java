package com.example.pr_2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {

    private Button btn;
    private HomeFragment homeFragment = new HomeFragment();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.button2);

        setNewFragment(homeFragment);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setNewFragment(homeFragment);
            }
        });
    }

    private void setNewFragment(Fragment fragment) {
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.frame, fragment);
        ft.commit();
    }

//    public void buttonClick(View view)
//    {
//        final EditText login = (EditText)findViewById(R.id.log);
//        final EditText password = (EditText)findViewById(R.id.passw);
//        if (login.getText().toString().equals("admin") && password.getText().toString().equals("admin"))
//            {
//                Intent myIntent = new Intent(MainActivity.this, HomeFragment.class);
//                MainActivity.this.startActivity(myIntent);
//            }
//        Log.d(TAG,"Кнопка нажата");
//    }

}