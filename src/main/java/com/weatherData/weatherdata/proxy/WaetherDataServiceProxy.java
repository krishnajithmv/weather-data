package com.weatherData.weatherdata.proxy;

import com.weatherData.weatherdata.domain.PostCode;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="postcode-service",url = "localhost:8010")
public interface WaetherDataServiceProxy {

    @GetMapping(value="/city/{cityName}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<PostCode> postcodeCode(@PathVariable("cityName") String cityName);
}
