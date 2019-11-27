package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    TextView result;
    Button add,subract,multiply,divide;
    EditText number1,number2;

    float res,num1,num2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result=(TextView)findViewById(R.id.result);
        add=(Button)findViewById(R.id.add);
        subract=(Button)findViewById(R.id.subract);
        multiply=(Button)findViewById(R.id.multiply);
        divide=(Button)findViewById(R.id.divide);
        number1=(EditText)findViewById(R.id.number1);
        number2=(EditText)findViewById(R.id.number2);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1=Integer.parseInt(number1.getText().toString());
                num2=Integer.parseInt(number2.getText().toString());
                res=num1+num2;
                result.setText(String.valueOf(res));

            }
        });

        subract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1=Integer.parseInt(number1.getText().toString());
                num2=Integer.parseInt(number2.getText().toString());
                res=num1-num2;
                result.setText(String.valueOf(res));

            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1=Integer.parseInt(number1.getText().toString());
                num2=Integer.parseInt(number2.getText().toString());
                res=num1*num2;
                result.setText(String.valueOf(res));

            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1=Integer.parseInt(number1.getText().toString());
                num2=Integer.parseInt(number2.getText().toString());
                res=num1/num2;
                result.setText(String.valueOf(res));

            }
        });
    }


}
