package com.example.my_calculator_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView answer;
    EditText num1, num2;
    Button sum, goMul;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        answer = (TextView) findViewById(R.id.add_view);
        num1 = (EditText) findViewById(R.id.num_01);
        num2 = (EditText) findViewById(R.id.num_02);
        sum = (Button) findViewById(R.id.button_sum);
        goMul = (Button) findViewById(R.id.go_mul);

        sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num_one = Integer.parseInt(num1.getText().toString());
                int num_two = Integer.parseInt(num2.getText().toString());
                int ans = num_one + num_two;
                answer.setText(String.valueOf(ans));

            }
        });
        goMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MulActivity.class);
                startActivity(intent);
            }
        });

    }
}