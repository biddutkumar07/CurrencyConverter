package com.example.biddutkumar.currencyconverter2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button convertBtn=findViewById(R.id.convertBtn);
        final TextView resultTV=findViewById(R.id.resultTV);
        final EditText inputET=findViewById(R.id.inputET);

        final RadioButton tkTorupeeRB=findViewById(R.id.tkTorupeeRB);
        final RadioButton rupeeTotkRB=findViewById(R.id.rupeeTotkRB);

        final RadioButton tkToeuroRB=findViewById(R.id.tkToeuroRB);
        final RadioButton euroTotkRB=findViewById(R.id.euroTotkRB);

        final RadioButton tkTopoundRB=findViewById(R.id.tkTopoundRB);
        final RadioButton poundTotkRB=findViewById(R.id.poundTotkRB);

        final RadioButton tkTodollarRB=findViewById(R.id.tkTodollarRB);
        final RadioButton dollarTotkRB=findViewById(R.id.dollarTotkRB);

        convertBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String inputValue=inputET.getText().toString();

                if(inputValue.equals(""))
                {
                    Toast.makeText(MainActivity.this, "Please enter your balance", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    if(dollarTotkRB.isChecked()==true)
                    {
                        float value=Float.valueOf(inputValue);
                        float result=value*80;
                        resultTV.setText(String.valueOf(result)+" Taka");
                    }
                    else if(tkTodollarRB.isChecked()==true)
                    {
                        float value = Float.valueOf(inputValue);
                        float result=value/80;
                        resultTV.setText(String.valueOf(result)+" Dollar");
                    }

                    else if(poundTotkRB.isChecked()==true)
                    {
                        float value=Float.valueOf(inputValue);
                        float result=value*107.83f;
                        resultTV.setText(String.valueOf(result)+" Taka");
                    }
                    else if(tkTopoundRB.isChecked()==true)
                    {
                        float value=Float.valueOf(inputValue);
                        float result=value/107.83f;
                        resultTV.setText(String.valueOf(result)+" Pound");
                    }

                    else if(euroTotkRB.isChecked()==true)
                    {
                        float value=Float.valueOf(inputValue);
                        float result=value*94.57f;
                        resultTV.setText(String.valueOf(result)+" Taka");
                    }
                    else if(tkToeuroRB.isChecked()==true)
                    {
                        float value=Float.valueOf(inputValue);
                        float result=value/94.57f;
                        resultTV.setText(String.valueOf(result)+" Euro");
                    }

                    else if(rupeeTotkRB.isChecked()==true)
                    {
                        float value=Float.valueOf(inputValue);
                        float result=value*1.18f;
                        resultTV.setText(String.valueOf(result)+" Taka");
                    }
                    else if(tkTorupeeRB.isChecked()==true)
                    {
                        float value=Float.valueOf(inputValue);
                        float result=value/1.18f;
                        resultTV.setText(String.valueOf(result)+" Euro");
                    }
                }

            }
        });


    }
}
