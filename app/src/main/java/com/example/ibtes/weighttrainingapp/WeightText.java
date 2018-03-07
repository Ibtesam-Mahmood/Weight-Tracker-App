package com.example.ibtes.weighttrainingapp;

import android.content.Context;
import android.support.v7.widget.AppCompatTextView;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by User on 3/7/2018.
 */

public class WeightText extends AppCompatTextView {

    public WeightText (Context context, String weight){

        super(context);

        int paddingSize = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 10, context.getResources().getDisplayMetrics());

        LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT);

        lp.setMargins(0, paddingSize, 0, 0);

        setPadding(0, paddingSize, 0, paddingSize);

        setTextSize(TypedValue.COMPLEX_UNIT_SP, 24); //Sets the text size to 24 sp
        setGravity(Gravity.CENTER); //Centers the text


        String dateFormat =  new SimpleDateFormat("yyyy/MM/dd").format(new Date());

        setText(weight + " kg on " + dateFormat);

    }

}
