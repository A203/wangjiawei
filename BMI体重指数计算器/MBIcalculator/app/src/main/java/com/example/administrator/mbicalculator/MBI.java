package com.example.administrator.mbicalculator;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MBI extends ActionBarActivity {
    private EditText height=null;
    private EditText weight=null;
    private Button button=null;
    private TextView show=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mbi);
        Button button=(Button)findViewById(R.id.BMIbutton);

        height=(EditText) findViewById(R.id.height);
        weight=(EditText) findViewById(R.id.weight);
        show=(TextView) findViewById(R.id.show);



        button.setOnClickListener(new View.OnClickListener() {
            double bmi = 0;

            public void onClick(View v) {

                double h = new Double(height.getText().toString())/100;
                double w = new Double(weight.getText().toString());

                bmi = w / (h * h);

                double final_resault = exchangeResault(bmi);
                if (bmi < 18.5) {
                    show.setText("The BMI is " + final_resault + "" + ".  You are underweight.");}
                else if (bmi > 18.5 & bmi < 24) {
                    show.setText("The BMI is " + final_resault + "" + ".  You are normal weight.");}
                else if (bmi >= 24 & bmi < 27) {
                    show.setText("The BMI is " + final_resault + "" + ".  You are a little fat.");}

                else if (bmi >= 27 & bmi < 30) {
                    show.setText("The BMI is " + final_resault + "" + ".  You are Mild obesity.");}
                else if (bmi >= 30 & bmi < 35) {
                    show.setText("The BMI is " + final_resault + "" + ".  You are Moderate obesity.");}
                else if (bmi>35){
                    show.setText("The BMI is " + final_resault + "" + ".  You are Severe obesity.");
                }
            }
        });

    }

    public double exchangeResault(double resault){
        double first=resault*100;
        double second=(int )first;
        double second_first=first-second;

        if(second_first>0.5){
            second++;
        }

        double jirnuo=(double)second/100;
        return jirnuo;
    }}