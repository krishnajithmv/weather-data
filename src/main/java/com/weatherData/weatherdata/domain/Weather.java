package com.weatherData.weatherdata.domain;

import javax.persistence.*;

@Entity
@Table(name="weather")
public class Weather {
    @Id
    @Column(name = "PinCode")
    String pincode;
    @Column(name = "Temperature")
    String temperature;
    @Column(name = "Humidity")
    String humidity;
    @Column(name = "Pressure")
    String pressure;
    @Column(name = "Wind")
    String wind;
    @Column(name = "Visibility")
    String visibility;

    public Weather(String pincode, String temperature, String humidity, String pressure, String wind, String visibility) {
        this.pincode = pincode;
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        this.wind = wind;
        this.visibility = visibility;
    }

    public Weather() {
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getHumidity() {
        return humidity;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }

    public String getPressure() {
        return pressure;
    }

    public void setPressure(String pressure) {
        this.pressure = pressure;
    }

    public String getWind() {
        return wind;
    }

    public void setWind(String wind) {
        this.wind = wind;
    }

    public String getVisibility() {
        return visibility;
    }

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }
}
