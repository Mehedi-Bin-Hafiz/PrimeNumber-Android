package com.mehedibinhafiz.primenumber;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button ab,prime;
    TextView tv;
    EditText edt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ab=findViewById(R.id.ab);
        prime=findViewById(R.id.prime);
        tv=findViewById(R.id.tv);
        edt=findViewById(R.id.edt);


    }

    public void prime(View view){
        String value = edt.getText().toString();
        int p = Integer.valueOf(value);
        int i=0,count=0;
        String result;
        for ( i=2;i<p;i++){
            if( p % 2 == 0){
                count = count+1;
            }
        }
        if (count>0){
            tv.setText(value+" is a prime number");

        }
        else {
            tv.setText(value+" is not a prime number");
        }

    }


}
