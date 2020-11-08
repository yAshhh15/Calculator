package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button ADD;
    private Button SUB;
    private Button DIV;
    private Button MUL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ADD=(Button)findViewById(R.id.btnadd);
        ADD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               openADD();
            }
        });
        SUB=(Button)findViewById(R.id.btnsub);
        SUB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSUB();
            }
        });


        DIV=(Button)findViewById(R.id.btndiv);
        DIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDIV();
            }
        });


        MUL=(Button)findViewById(R.id.btnmul);
        MUL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMUL();
            }
        });
    }

    public void openADD() {
        Intent intent=new Intent(this,ADD.class);
        startActivity(intent);

    }

    public void openSUB() {
     Intent intent=new Intent(this,Subtract.class);
     startActivity(intent);

    }

    public void openDIV() {
        Intent intent=new Intent(this,Divide.class);
        startActivity(intent);

    }

    public void openMUL() {
        Intent intent=new Intent(this,Multi.class);
        startActivity(intent);

    }
}