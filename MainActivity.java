package com.example.checklist2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
CheckBox cb1,cb2;
Button b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        cb1=(CheckBox)findViewById(R.id.cb1);
        cb2=(CheckBox)findViewById(R.id.cb2);
        b1=(Button)findViewById(R.id.b1);
        b2=(Button)findViewById(R.id.b2);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               cb1.setChecked(true);
                cb2.setChecked(false);
                Toast toast=Toast.makeText(getApplicationContext(),String.valueOf("Changing Checkbox 1 state"),Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cb2.setChecked(true);
                cb1.setChecked(false);
                Toast toast=Toast.makeText(getApplicationContext(),String.valueOf("Changing Checkbox 2 state"),Toast.LENGTH_SHORT);
                toast.show();
            }
        });
    }
}