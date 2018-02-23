package com.example.ibtes.weighttrainingapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText) findViewById(R.id.inputText);
    }

    //Takes the inputted test and adds it as a recorded option
    public void onClickButton(View v){
        //Obtains the text within the input dialog
        String currentText =  editText.getText().toString();

        //Insures the logic only runs if the edit text was not initially empty
        if(currentText == "")
            return;

        editText.setText(""); //Resets the edit text

        LinearLayout layout = (LinearLayout) findViewById(R.id.textLayout); //Refrences the linear layout

        //Sets the parameters for the new text
        ViewGroup.LayoutParams params =  new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT);

        TextView newText =  new TextView(this);
        newText.setText(currentText); //Sets the text to the inputted text
        newText.setTextSize(TypedValue.COMPLEX_UNIT_SP, 24); //Stes the text size to 24 sp
        newText.setLayoutParams(params); //Sets the parameters for the text view

        layout.addView(newText); //Adds the text t the layout

    }
}
