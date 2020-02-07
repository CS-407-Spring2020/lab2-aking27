package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.util.Log;
import android.view.View;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void clickFunction(View view){
        Log.i("info","Button pressed");
        EditText myTextField = (EditText) findViewById(R.id.myTextField);
        Toast.makeText(MainActivity.this, myTextField.getText().toString(), Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
