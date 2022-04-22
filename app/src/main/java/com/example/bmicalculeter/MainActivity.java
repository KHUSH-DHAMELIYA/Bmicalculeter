package com.example.bmicalculeter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button Submit;
    TextView Number;
    EditText Weight,Height;
    float W,H,Ans,X;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Submit =findViewById(R.id.Submit);
        Number = findViewById(R.id.Number);
        Weight = findViewById(R.id.Weight);
        Height = findViewById(R.id.Height);

        Submit.setOnClickListener(new View.OnClickListener (){
            @Override
            public void onClick(View view) {
                float  H = Float.parseFloat(Height.getText().toString());
                float  W = Float.parseFloat(Weight.getText().toString());


                X =H/100;
                Ans =W/(X*X);

                if (Ans < 18.5){
                    Number.setText("Underweight" + Ans);
                }else if (Ans >18.5 && Ans<25){
                    Number.setText("Healthy Weight" + Ans);
                }else if (Ans >25 && Ans<30){
                    Number.setText("pre obesity" + Ans);
                }else{
                    Number.setText("obesity" + Ans);
                }
            }

        });
    }
}