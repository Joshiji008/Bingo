package com.example.bingorestart;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.Arrays;

public class Main2Activity extends AppCompatActivity {
    Button b2,b3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        b2 = (Button)findViewById(R.id.button2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2 = new Intent(Main2Activity.this,Main3Activity.class);
                Bundle extras = getIntent().getExtras();

                int[] combination = extras.getIntArray("COMBINATION");
                combination[0] = 1;
//                Log.d("array log", Arrays.toString(combination));


                i2.putExtra("COMBINATION", combination);

                startActivity(i2);
            }
        });
        b3 = (Button)findViewById(R.id.button3);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i3 = new Intent(Main2Activity.this,Main3Activity.class);
                Bundle extras = getIntent().getExtras();

                int[] combination = extras.getIntArray("COMBINATION");
                combination[0] = 0;
                Log.d("array log", Arrays.toString(combination));

                i3.putExtra("COMBINATION", combination);

                startActivity(i3);
            }
        });
    }
}
