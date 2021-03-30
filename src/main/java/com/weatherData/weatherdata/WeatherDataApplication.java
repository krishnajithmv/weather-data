package com.weatherData.weatherdata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients("com.weatherData.weatherdata")
@EntityScan("com.weatherData.weatherdata.domain")
public class WeatherDataApplication {
	public static void main(String[] args) {
		SpringApplication.run(WeatherDataApplication.class, args);
	}
}
