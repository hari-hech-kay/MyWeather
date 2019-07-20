package com.example.tcs.myweather;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class JSONWeatherParser {

    public static Weather getWeather(String jsonData) throws JSONException {

        Weather weather = new Weather();
        JSONObject root = new JSONObject(jsonData);

        JSONObject coord = root.getJSONObject("coord");
        weather.setLatitude((float)coord.getDouble("lat"));
        weather.setLongitude((float)coord.getDouble("lon"));

        JSONObject sys = root.getJSONObject("sys");
        weather.setCountry(sys.getString("country"));

        weather.setCity(root.getString("name"));

        weather.setSunrise(sys.getLong("sunrise"));
        weather.setSunset(sys.getLong("sunset"));

        JSONArray array = root.getJSONArray("weather");
        JSONObject JSONWeather = array.getJSONObject(0);
        weather.setDescription(JSONWeather.getString("description"));

        JSONObject main = root.getJSONObject("main");
        weather.setTemp((float)main.getDouble("temp"));
        weather.setMinTemp();Temp((float)main.getDouble("temp"));



    }

}
