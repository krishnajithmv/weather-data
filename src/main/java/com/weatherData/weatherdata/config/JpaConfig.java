package com.weatherData.weatherdata.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = "com.weatherData.weatherdata.repository")
public class JpaConfig {

}