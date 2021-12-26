package com.example.area_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class triangle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triangle);
        Button calculate=findViewById(R.id.calculate);
        EditText base=findViewById(R.id.base);
        EditText height=findViewById(R.id.height);
        TextView answer=findViewById(R.id.ans);
        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!base.getText().toString().isEmpty()&&!height.getText().toString().isEmpty())
                {
                    float a= (float)(Float.parseFloat(base.getText().toString())*Float.parseFloat(height.getText().toString())*0.5);
                    answer.setText(Float.toString(a));
                    base.setText("");
                    height.setText("");
                }
            }
        });
    }
}