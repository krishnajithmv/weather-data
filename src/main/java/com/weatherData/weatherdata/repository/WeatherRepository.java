package com.weatherData.weatherdata.repository;

import com.weatherData.weatherdata.domain.PostCode;
import com.weatherData.weatherdata.domain.Weather;
import org.springframework.data.repository.CrudRepository;

public interface WeatherRepository extends CrudRepository<Weather, String> {

}