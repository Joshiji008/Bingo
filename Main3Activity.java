package com.example.bingorestart;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.Arrays;

public class Main3Activity extends AppCompatActivity {
    Button b4,b5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        b4 = (Button)findViewById(R.id.button4);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i4 = new Intent(Main3Activity.this,Main4Activity.class);
                Bundle extras = getIntent().getExtras();

                int[] combination = extras.getIntArray("COMBINATION");
                combination[1] = 0;
                Log.d("array log", Arrays.toString(combination));

                i4.putExtra("COMBINATION", combination);

                startActivity(i4);
            }
        });
        b5 = (Button)findViewById(R.id.button5);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i5 = new Intent(Main3Activity.this,Main4Activity.class);
                Bundle extras = getIntent().getExtras();

                int[] combination = extras.getIntArray("COMBINATION");
                combination[1] = 1;
                Log.d("array log", Arrays.toString(combination));

                i5.putExtra("COMBINATION", combination);

                startActivity(i5);
            }
        });
    }
}
