package com.example.bingorestart;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main6Activity extends AppCompatActivity {
    Map<String, String> codes = new HashMap<String, String>();


    TextView resultView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        codes.put("1100", "AMIT");
        codes.put("1000", "JEETU");
        codes.put("0011", "ROHIT");
        codes.put("1101", "GOPAL");
        codes.put("0001", "RAHUL");
        codes.put("0111", "SAAVAN");
        codes.put("1111", "DAKSH");
        codes.put("1010", "MOHIT");
        codes.put("0010", "HARIOM");
        codes.put("0100", "ANIL");

        Bundle extras = getIntent().getExtras();
        resultView = findViewById(R.id.result);

        int[] combination = extras.getIntArray("COMBINATION");

        Log.d("array log", Arrays.toString(combination));
        String result = myJoin(combination, "");

        for (Map.Entry<String, String> code : codes.entrySet()) {
            Log.d("code string log", code.getKey() + " :  " + code.getValue());

            if (code.getKey().equals(result)) {
                resultView.setText(code.getValue());
               break;
            }
            else {
                resultView.setText("YOU CHEATED !");
            }

        }
        Log.d("result string log", result);

    }

    public static String myJoin(int[] arr, String separator) {
        if (null == arr || 0 == arr.length) return "";

        StringBuilder sb = new StringBuilder(256);
        sb.append(arr[0]);

        //if (arr.length == 1) return sb.toString();

        for (int i = 1; i < arr.length; i++) sb.append(separator).append(arr[i]);

        return sb.toString();
    }
}
