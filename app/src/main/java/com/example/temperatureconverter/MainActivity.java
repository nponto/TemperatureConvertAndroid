package com.example.temperatureconverter;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.temperatureconverter.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void getTemperatureCelcius(View view) {
        int intMessage;
        double resultCelcius;
        String stringMessage;

        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.editTextNumber2);

        String message = editText.getText().toString();
        intMessage = Integer.parseInt(message);
        resultCelcius = Math.round((intMessage - 32) * (.5555555555555));
        stringMessage = message + "° F is: "  + resultCelcius + "° C";

        intent.putExtra(EXTRA_MESSAGE, stringMessage);
        startActivity(intent);
    }

    public void getTemperatureFahrenheit(View view) {
        int intMessage;
        double resultFahrenheit;
        String stringMessage;

        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.editTextNumber2);

        String message = editText.getText().toString();
        intMessage = Integer.parseInt(message);
        resultFahrenheit = Math.round((intMessage * 1.8) + 32);
        stringMessage = message + "° C is: " + resultFahrenheit + "° F";

        intent.putExtra(EXTRA_MESSAGE, stringMessage);
        startActivity(intent);


    }
}