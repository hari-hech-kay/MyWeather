package com.example.tcs.myweather;

public class Weather {

    private float longitude;
    private float latitude;
    private long sunset;
    private long sunrise;
    private String country;
    private String city;
    private String description;
    private float temp;
    private float minTemp;
    private float maxTemp;
    private float windSpeed;
    private float windDegree;
    private String rainTime;
    private float rainAmount;
    private int cloudsPercent;


    public float getLatitude() {
        return latitude;
    }

    public float getLongitude() {
        return longitude;
    }

    public long getSunrise() {
        return sunrise;
    }

    public long getSunset() {
        return sunset;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }
    public float getMaxTemp() {
        return maxTemp;
    }

    public float getTemp() {
        return temp;
    }

    public float getMinTemp() {
        return minTemp;
    }

    public String getDescription() {
        return description;
    }

    public float getRainAmount() {
        return rainAmount;
    }

    public float getWindDegree() {
        return windDegree;
    }

    public float getWindSpeed() {
        return windSpeed;
    }

    public int getCloudsPercent() {
        return cloudsPercent;
    }

    public String getRainTime() {
        return rainTime;
    }


    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setSunrise(long sunrise) {
        this.sunrise = sunrise;
    }

    public void setSunset(long sunset) {
        this.sunset = sunset;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setMaxTemp(float maxTemp) {
        this.maxTemp = maxTemp;
    }

    public void setMinTemp(float minTemp) {
        this.minTemp = minTemp;
    }

    public void setRainTime(String rainTime) {
        this.rainTime = rainTime;
    }

    public void setTemp(float temp) {
        this.temp = temp;
    }

    public void setWindSpeed(float windSpeed) {
        this.windSpeed = windSpeed;
    }

    public void setCloudsPercent(int cloudsPercent) {
        this.cloudsPercent = cloudsPercent;
    }

    public void setRainAmount(float rainAmount) {
        this.rainAmount = rainAmount;
    }

    public void setWindDegree(float windDegree) {
        this.windDegree = windDegree;
    }

}
