package com.example.ibtes.weighttrainingapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

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
        if(currentText.isEmpty())
            return;

        editText.setText(""); //Resets the edit text

        LinearLayout layout = (LinearLayout) findViewById(R.id.textLayout); //Refrences the linear layout

        //Sets the parameters for the new text
        ViewGroup.LayoutParams params =  new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT);



        if(isNumeric(currentText)){
//            TextView newText =  new TextView(this);
//
//            newText.setText(currentText); //Sets the text to the inputted text
//            newText.setTextSize(TypedValue.COMPLEX_UNIT_SP, 24); //Sets the text size to 24 sp
//            newText.setGravity(Gravity.CENTER); //Centers the text
//            newText.setLayoutParams(params); //Sets the parameters for the text view
//
//            layout.addView(newText); //Adds the text t the layout

            WeightText weight = new WeightText(this, currentText);
            layout.addView(weight);
        }
        else{
            Toast.makeText(this, "Not numeric", Toast.LENGTH_SHORT).show();
        }


    }

    public boolean isNumeric(String str)
    {
        try
        {
            double d = Double.parseDouble(str);
        }
        catch(NumberFormatException nfe)
        {
            return false;
        }
        return true;
    }


}
