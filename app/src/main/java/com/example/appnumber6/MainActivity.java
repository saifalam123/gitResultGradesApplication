package com.example.appnumber6;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final TextView txtResult = (TextView)findViewById(R.id.txtResult); // We don't create the object for txtEnter because we don't want to change or get some new value on that field!
        final EditText edtNumber = (EditText)findViewById(R.id.edtNumber);
        Button btnResult = (Button)findViewById(R.id.btnResult);

        btnResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String textFieldValue = edtNumber.getText() + ""; // By putting + "" at the end we are converting edtible text into string value!
                int intvalue = Integer.parseInt(textFieldValue); // Integer,parseint iss liye use hota hai kay hum jab kisi integer walue ko kis string kay baraber karte hain.
                String result;

                /*if (textFieldValue.contains("51"))
                {
                    txtResult.setText(textFieldValue + " Great ");
                }
                else
                {
                    txtResult.setText(textFieldValue + "Not 51 and Not great");
                }*/
              /*  if (textFieldValue.contains("90")){
                    result = "Tour Grade is A and your number is " + textFieldValue;
                }
                else if (textFieldValue.contains("80")){
                    result = "Tour Grade is B and your number is " + textFieldValue;
                }
                else if (textFieldValue.contains("70")){
                    result = "Tour Grade is C and your number is " + textFieldValue;
                }
                else if (textFieldValue.contains("60")){
                    result = "Tour Grade is F and your number is " + textFieldValue;
                }
                else{
                    result = "No Result ";
                }
                txtResult.setText(result); */

              if (intvalue > 90){
                  result = "your grade is A and your number is:  " + intvalue;
              }
              else if (intvalue > 80){
                  result = "Your Grade is B and your number is: " + intvalue;
              }
              else if (intvalue > 70){
                  result = "your Grade is C and your number is: " + intvalue;

              }
              else if (intvalue > 60){
                  result = "You are fail and your number is: " + intvalue;

              }
              else{
                  result = "Not Found";
              }
              txtResult.setText(result);
            }
        });


    }


}
