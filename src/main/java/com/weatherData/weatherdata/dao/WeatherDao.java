package com.weatherData.weatherdata.dao;

import com.weatherData.weatherdata.domain.Weather;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class WeatherDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public Weather getWeatherByPostcode(String pincode) {
        return jdbcTemplate.queryForObject("select * from weather where pincode='"+pincode+"'",new RowMapper<Weather>(){
            public Weather mapRow(ResultSet rs, int rownumber) throws SQLException, SQLException {
                Weather wthr = new Weather();
                wthr.setPincode(rs.getString(1));
                wthr.setTemperature(rs.getString(2));
                wthr.setHumidity(rs.getString(3));
                wthr.setPressure(rs.getString(4));
                wthr.setWind(rs.getString(5));
                wthr.setVisibility(rs.getString(6));
                return wthr;
            }
        });
    }

}
