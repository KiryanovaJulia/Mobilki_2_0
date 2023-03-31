package com.example.pr_2;

import static android.content.ContentValues.TAG;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class Fragments extends Fragment {
    public Fragments(){
        super((R.layout.home_frame));
    }


    public void onAttach(@NonNull Context context){
        super.onAttach(context);
        Log.i(TAG, "onAttach");
        Toast.makeText(context, "onAttach", Toast.LENGTH_SHORT).show();
    }

    public void onCreate(@Nullable Bundle savedInstantState){
        super.onCreate(savedInstantState);
        Log.i(TAG, "onCreate");
        Toast.makeText(getContext(), "onCreate", Toast.LENGTH_SHORT).show();


//        Bundle bundle = new Bundle();
//        bundle.putString("Name", binding.getText().toString());


//        getSupportFragmentManager().beginTransaction()
//                .setReorderingAllowed(true)
//                .add(R.id.imageButton3, new Fragments())
//                .commit();
//
//    }
//
//    private FragmentManager getSupportFragmentManager(){

    }

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState){
        Log.i(TAG, "onCreateView");
        Toast.makeText(getContext(), "onCreateView", Toast.LENGTH_SHORT).show();


       return onCreateView(inflater, container, savedInstanceState);
    }

    public void onViewCreate(@Nullable Bundle savedInstantState) {
        super.onCreate(savedInstantState);
        Log.i(TAG, "onViewCreate");
        Toast.makeText(getContext(), "onViewCreate", Toast.LENGTH_SHORT).show();



        String name = requireArguments().getString(String.valueOf(R.id.log));

        TextView nameView = (TextView) getView().findViewById(R.id.log);
        nameView.setText(name);




    }


    public void onViewStateRestored(@Nullable  Bundle savedInstantState){
        super.onViewStateRestored(savedInstantState);
        Log.i(TAG, "onViewStateRestored");
        Toast.makeText(getContext(), "onViewStateRestored", Toast.LENGTH_SHORT).show();
    }

    public void onStart() {
        super.onStart();
        Log.i(TAG, "onStart");
        Toast.makeText(getContext(), "onStart", Toast.LENGTH_SHORT).show();
    }
    public void onResume() {
        super.onResume();
        Log.i(TAG, "onResume");
        Toast.makeText(getContext(), "onResume", Toast.LENGTH_SHORT).show();
    }

    public void onPause() {
        super.onPause();
        Log.i(TAG, "onPause");
        Toast.makeText(getContext(), "onPause", Toast.LENGTH_SHORT).show();
    }

    public void onStop() {
        super.onStop();
        Log.i(TAG, "onStop");
        Toast.makeText(getContext(), "onStop", Toast.LENGTH_SHORT).show();
    }

    public void onDestroyView() {
        super.onDestroyView();
        Log.i(TAG, "onDestroyView");
        Toast.makeText(getContext(), "onDestroyView", Toast.LENGTH_SHORT).show();
    }


        public void onDestroy() {
            super.onDestroy();
            Log.i(TAG, "onDestroy");
            Toast.makeText(getContext(), "onDestroy", Toast.LENGTH_SHORT).show();
    }
}
