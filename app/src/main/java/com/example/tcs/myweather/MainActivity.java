package com.example.tcs.myweather;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button temperature;
    TextView date;
    TextView time;
    TextView weather_text;
    TextView min_temp;
    TextView max_temp;
    TextView location;
    TextView sunrise;
    TextView sunset;
    ImageView weather_icon;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        date = findViewById(R.id.temperature);
        weather_text = findViewById(R.id.weather_text);
        min_temp = findViewById(R.id.min_temp);
        max_temp = findViewById(R.id.max_temp);
        location = findViewById(R.id.location);
        sunrise = findViewById(R.id.sunrise_time);
        sunset = findViewById(R.id.sunset_time);
        weather_icon = findViewById(R.id.weather_image);

    }
}
