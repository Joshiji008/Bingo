package com.example.bingorestart;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import java.util.Arrays;

public class Main4Activity extends AppCompatActivity {
    Button b6,b7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        b6 = (Button)findViewById(R.id.button6);
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i6 = new Intent(Main4Activity.this,Main5Activity.class);
                Bundle extras = getIntent().getExtras();

                int[] combination = extras.getIntArray("COMBINATION");
                combination[2] = 1;
                Log.d("array log", Arrays.toString(combination));

                i6.putExtra("COMBINATION", combination);

                startActivity(i6);
            }
        });
        b7 = (Button)findViewById(R.id.button7);
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i7 = new Intent(Main4Activity.this,Main5Activity.class);
                Bundle extras = getIntent().getExtras();

                int[] combination = extras.getIntArray("COMBINATION");
                combination[2] = 0;
                Log.d("array log", Arrays.toString(combination));

                i7.putExtra("COMBINATION", combination);

                startActivity(i7);
            }
        });
    }
}
