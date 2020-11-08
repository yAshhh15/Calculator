package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Divide extends AppCompatActivity {

    private EditText num1;
    private EditText num2;
    private TextView result;
    private Button eq_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_divide);

        num1=(EditText)findViewById(R.id.etNum1);
        num2=(EditText)findViewById(R.id.etNum2);
        eq_btn=(Button)findViewById(R.id.btneq);
        result=(TextView)findViewById(R.id.tvdiv);

        eq_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n1 = Integer.parseInt(num1.getText().toString());
                int n2 = Integer.parseInt(num2.getText().toString());
                int divi = n1 / n2;
                result.setText("Answer: " + String.valueOf(divi));
            }
        });
    }
}