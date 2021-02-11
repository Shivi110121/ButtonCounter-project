package com.example.button_counter_patels;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity
{
    private String TAG = "MainActivity";
    private Button incrementButton;
    private Button decrementButton;
    private Button resetButton;
    private TextView display;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        display = findViewById(R.id.displayId);



        incrementButton = findViewById(R.id.IncrementButton);
        incrementButton.setText("Increment");
        incrementButton.setOnClickListener(new OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                incrementCounter();
            }
        });

        decrementButton = findViewById(R.id.DecrementButton);
        decrementButton.setText("Decrement");
        decrementButton.setOnClickListener(new OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                decrementCounter();
            }
        });


        resetButton = findViewById(R.id.ResetButton);
        resetButton.setText("Reset");
        resetButton.setOnClickListener(new OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                resetCounter();
            }
        });

    }

    private void resetCounter()
    {
        int currentValue = Integer.valueOf(display.getText().toString());
        currentValue = 0;
        display.setText(String.valueOf(currentValue));
    }

    private void decrementCounter()
    {
        int currentValue = Integer.valueOf(display.getText().toString());
        currentValue = currentValue - 1;
        display.setText(String.valueOf(currentValue));
    }



    private void incrementCounter()
    {
        int currentValue = Integer.valueOf(display.getText().toString());
        currentValue++;
        display.setText(String.valueOf(currentValue));
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState)
    {
        super.onSaveInstanceState(outState);

        String counterValue = display.getText().toString();
        outState.putString("display",counterValue);
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState)
    {
        super.onRestoreInstanceState(savedInstanceState);

        String counterValue = savedInstanceState.getString("display");
        display.setText(counterValue);
    }

    @Override
    protected void onStart()
    {
        super.onStart();
        Log.i(TAG,"I entered into OnStart");
    }

    @Override
    protected void onResume()
    {
        super.onResume();
        Log.i(TAG,"I entered into OnResume");
    }

    @Override
    protected void onPause()
    {
        super.onPause();
        Log.i(TAG,"I entered into OnPause");
    }

    @Override
    protected void onStop()
    {
        super.onStop();
        Log.i(TAG,"I entered into OnStop");
    }

    @Override
    protected void onRestart()
    {
        super.onRestart();
        Log.i(TAG,"I entered into OnRestart");
    }

    @Override
    protected void onDestroy()
    {
        super.onDestroy();
        Log.i(TAG,"I entered into OnDestroy");
    }

}