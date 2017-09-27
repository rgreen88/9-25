package com.example.rynel.emi_calculator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.util.Scanner;

public class MainActivity extends AppCompatActivity {



    Button btnUpdateValue;
    TextView tvUpdatedValue;
    EditText etUpdatedValue;
    EditText etUpdatedValue2;
    EditText etUpdatedValue3;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etUpdatedValue = (EditText) findViewById(R.id.etUpdatedValue);
        etUpdatedValue2 = (EditText) findViewById(R.id.etUpdatedValue2);
        etUpdatedValue3 = (EditText) findViewById(R.id.etUpdatedValue3);
        btnUpdateValue = (Button) findViewById(R.id.btnUpdatedValue);
        tvUpdatedValue = (TextView) findViewById(R.id.tvUpdatedValue);



        btnUpdateValue.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                //need to code in user input (added 2 additional EditText values) and add a try/catch to avoid crashing on submit
                //highlighted red is supposed to be user input using java Scanner, but useless in xml
                //correctly apply mathematical calculations
                //adding Scanner to remove errors

             //   try
                {
                    //add onClick
                }

                    Scanner input = new Scanner(System.in);
                    double ratePerYear = input.nextDouble();
                    double numberOfYearlyInstallments = input.nextDouble();
                    double loanAmount = ratePerYear / (12*100);
                    double total = (loanAmount * ratePerYear * (Math.pow((1 + ratePerYear), numberOfYearlyInstallments)) / ((Math.pow((1 + ratePerYear), numberOfYearlyInstallments)) - 1));
                    String results = Double.toString(total);
                tvUpdatedValue.setText(results);

            }
        });


    }
}