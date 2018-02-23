package com.example.ibtes.weighttrainingapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.inputText);
    }

    //Takes the inputted test and adds it as a recorded option
    public void onClickButton(View v){
        String currentText =  editText.getText().toString();

        if(currentText == "")
            return;

        editText.setText("");

        
    }
}
