package com.weatherData.weatherdata.controller;

import com.weatherData.weatherdata.domain.Weather;
import com.weatherData.weatherdata.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class WeatherDataProvider{
    @Autowired
    WeatherService weatherService;

    @GetMapping(value="/weather/postcode/{postcode}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Weather> weatherDataByPostcode(@PathVariable("postcode") String postcode){
        Weather response =  weatherService.getWeatherByPostcode(postcode);
        return new ResponseEntity<Weather>(response, HttpStatus.OK);
    }

    @GetMapping(value="/weather/city/{cityName}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Weather> weatherDataByCityName(@PathVariable("cityName") String cityName){
        Weather response = weatherService.getWeatherByCityName(cityName);
        return new ResponseEntity<Weather>(response, HttpStatus.OK);
    }

    @PostMapping(value="/weather/")
    public ResponseEntity<Weather> addData(@RequestBody Weather weather){
        Weather response = weatherService.saveWeather(weather);
        return new ResponseEntity<Weather>(response, HttpStatus.OK);
    }

    @DeleteMapping(value="/weather/")
    public ResponseEntity<Weather> deleteData(@RequestBody Weather weather){
        Weather response = weatherService.deleteWeather(weather);
        return new ResponseEntity<Weather>(response, HttpStatus.OK);
    }

    @PutMapping(value="/weather/")
    public ResponseEntity<Weather> updateData(@RequestBody Weather weather){
        Weather response = weatherService.updateWeather(weather);
        return new ResponseEntity<Weather>(response, HttpStatus.OK);
    }

}
