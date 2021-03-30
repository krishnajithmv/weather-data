package com.weatherData.weatherdata.service;

import com.weatherData.weatherdata.dao.WeatherDao;
import com.weatherData.weatherdata.domain.PostCode;
import com.weatherData.weatherdata.domain.Weather;
import com.weatherData.weatherdata.proxy.WaetherDataServiceProxy;
import com.weatherData.weatherdata.repository.PostCodeRepository;
import com.weatherData.weatherdata.repository.WeatherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

@Component
public class WeatherService {
    @Autowired
    WeatherDao weatherDao;

    @Autowired
    WaetherDataServiceProxy proxy;

    @Autowired
    WeatherRepository weatherRepository;

    @Transactional(readOnly = true)
    public Weather getWeatherByPostcode(String postcode){
//           return weatherDao.getWeatherByPostcode(postcode);

        Optional<Weather> rs = weatherRepository.findById(postcode);
        Weather weather = null;

        if(rs.isPresent())
            weather = rs.get();

        return weather;
    }

    public Weather getWeatherByCityName(String cityName) {
        ResponseEntity<PostCode> result = proxy.postcodeCode(cityName);
        PostCode postCode = result.getBody();
        return weatherDao.getWeatherByPostcode(postCode.getPostCode());

    }

    public Weather saveWeather(Weather weather) {
        weatherRepository.save(weather);
        return weather;
    }

    public Weather deleteWeather(Weather weather) {
        weatherRepository.delete(weather);
        return weather;
    }

    public Weather updateWeather(Weather weather) {
        weatherRepository.save(weather);
        return weather;
    }
}
