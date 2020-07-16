package com.example.bingorestart;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b1;
    int[] combination = new int[4];  // allocating memory to array

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button)findViewById(R.id.button);
        Toast.makeText(getApplicationContext(),"PLEASE GUESS A SINGLE NAME",Toast.LENGTH_SHORT).show();
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(MainActivity.this,Main2Activity.class);
                i1.putExtra("COMBINATION", combination);
                startActivity(i1);

            }
        });
    }
}
