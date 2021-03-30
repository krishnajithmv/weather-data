package com.weatherData.weatherdata.repository;

import com.weatherData.weatherdata.domain.PostCode;
import org.springframework.data.repository.CrudRepository;

public interface PostCodeRepository extends CrudRepository<PostCode, String> {

}