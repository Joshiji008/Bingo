package com.example.bingorestart;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.Arrays;

public class Main5Activity extends AppCompatActivity {
    Button b8,b9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        b8= (Button)findViewById(R.id.button8);
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i8 = new Intent(Main5Activity.this,Main6Activity.class);
                Bundle extras = getIntent().getExtras();

                int[] combination = extras.getIntArray("COMBINATION");
                combination[3] = 0;
                Log.d("array log", Arrays.toString(combination));

                i8.putExtra("COMBINATION", combination);

                startActivity(i8);

            }
        });
        b9= (Button)findViewById(R.id.button9);
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i9 = new Intent(Main5Activity.this,Main6Activity.class);
                Bundle extras = getIntent().getExtras();

                int[] combination = extras.getIntArray("COMBINATION");
                combination[3] = 1;
                Log.d("array log", Arrays.toString(combination));

                i9.putExtra("COMBINATION", combination);

                startActivity(i9);

            }
        });
    }
}
