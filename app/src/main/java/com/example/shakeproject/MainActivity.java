package com.example.shakeproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements SensorEventListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public void onSensorChanged(SensorEvent sensorEvent) {

        if (sensorEvent != null){
            float x = sensorEvent.values[0];
            float y = sensorEvent.values[1];
            float z = sensorEvent.values[2];

            if (x > 2 ||
                    x < -2 ||
                    y > 12 ||
                    y < -12 ||
                    z > 2 ||
                    z < -2){
                startActivity(new Intent(this, AnotherActivity.class));
            }
        }

    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int i) {

    }
}