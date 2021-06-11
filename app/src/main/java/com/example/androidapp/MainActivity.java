package com.example.androidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    TextView textView;
    ImageView imageView;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        editText = findViewById(R.id.name);
//        textView = findViewById(R.id.textView);
        imageView = findViewById(R.id.imageView2);
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.setImageResource(R.drawable.splash);
            }
        });

    }

//    @Override
//    protected void  onResume() {
//
//        super.onResume();
//
//        SharedPreferences preferences = getSharedPreferences("Name",MODE_MULTI_PROCESS);
//        String name =preferences.getString("uname","");
//        textView.setText(name);
//
//
//
//    }
//    @Override
//    protected void onPause() {
//        super.onPause();
//
//        SharedPreferences preferences= getSharedPreferences("Name",MODE_PRIVATE);
//        SharedPreferences.Editor editor = preferences.edit();
//        editor.putString("uname", editText.getText().toString());
//        editor.commit();
//    }
}