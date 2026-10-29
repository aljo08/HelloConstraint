package com.example.helloconstraint;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private int mCount = 0;
    private TextView mShowCount;
    private Button mButtonZero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mShowCount = findViewById(R.id.show_count);
        mButtonZero = findViewById(R.id.button_zero);
    }
    public void showToast(View view) {
        Toast.makeText(this, "Hello Toast! Count: " + mCount, Toast.LENGTH_SHORT).show();
    }

    public void countUp(View view) {
        mCount++;
        mShowCount.setText(String.valueOf(mCount));

        // Zero button becomes active (pink)
        mButtonZero.setBackgroundColor(Color.parseColor("#FF4081"));
        if (mCount % 2 == 0) {
            view.setBackgroundColor(Color.GREEN);
        } else {
            view.setBackgroundColor(Color.parseColor("#3F51B5"));
        }
    }

    public void resetCount(View view) {
        mCount = 0;
        mShowCount.setText(String.valueOf(mCount));

        view.setBackgroundColor(Color.GRAY);

        findViewById(R.id.button_count).setBackgroundColor(Color.parseColor("#3F51B5"));
    }
}