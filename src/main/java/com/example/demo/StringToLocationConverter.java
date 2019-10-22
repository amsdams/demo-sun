package com.example.demo;

import org.springframework.core.convert.converter.Converter;

import com.example.demo.model.Location;

public class StringToLocationConverter implements Converter<String, Location> {
 
    @Override
    public Location convert(String source) {
        Location l = new Location();
        String [] latlong = source.split(",");
        l.setLatitude(Double.parseDouble(latlong[0]));
        l.setLongitude(Double.parseDouble(latlong[1]));

        return l;
    }
}