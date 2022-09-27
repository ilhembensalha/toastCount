package com.example.myapplication;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView editText ;
    Button oneButton;
    Button Button;
    int count = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = (TextView) findViewById(R.id.textView8);
        oneButton= (Button) findViewById(R.id.button5);
        Button= (Button) findViewById(R.id.button2);
        Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {Toast.makeText(getApplicationContext(),"Hello Toast ",Toast.LENGTH_SHORT).show();
            }
        });
        oneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                count ++;
                editText.setText(String.valueOf(count));

            }
        });

    }


}