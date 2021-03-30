package com.weatherData.weatherdata.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PostCode {
    @Id
    String postCode;
    String cityName;

    public PostCode(String postCode, String cityName) {
        this.postCode = postCode;
        this.cityName = cityName;
    }

    public PostCode() {
    }

    public String getPostCode() {
        return postCode;
    }

    public String getCityName() {
        return cityName;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public boolean equals(PostCode o) {
        return this.getPostCode().equals(o.getPostCode()) && this.getCityName().equals(o.getCityName());
    }
}

