/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.sunshine;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO (1) Create a field to store the weather display TextView
    TextView mWeatherTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forecast);

        // TODO (2) Use findViewById to get a reference to the weather display TextView
        mWeatherTextView = (TextView) findViewById(R.id.tv_weather_data);

        // TODO (3) Create an array of Strings that contain fake weather data
        String[] dummyWeatherData = {
                "Today, May 17 - Clear - 17°C / 15°C",
                "Tomorrow - SuperBowl - 19°C / 15°C",
                "Monday - Rainy- 20°C / 11°C",
                "Tuesday - Sunny - 11°C / 9°C",
                "Wednesday - Neat - 16°C / 7°C",
                "Thursday - Nice - 16°C / 8°C",
                "Friday - Partly Cloudy - 15°C / 10°C",
                "Sat, Feb 10 - Meatballs - 16°C / 18°C",
                "Sun, Feb 11 - Cloudy - 19°C / 15°C",
                "Mon, Feb 12 - Stormy - 30°C / 11°C",
                "Tues, Feb 13 - Hurricane - 21°C / 9°C",
                "Wed, Feb 14 - Meteors - 16°C / 7°C",
                "Thur, Feb 15 - Apocalypse - 16°C / 8°C",
                "Fri, Feb 16 - Post Apocalypse - 15°C / 10°C",
        };

        // TODO (4) Append each String from the fake weather data array to the TextView
        for (String datum : dummyWeatherData){
            mWeatherTextView.append(datum + "\n\n\n");
        }
    }
}