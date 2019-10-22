package com.example.demo;

import org.springframework.core.convert.converter.Converter;

import com.example.demo.model.Interval;

public class StringToIntervalConverter implements Converter<String, Interval> {
 
    @Override
    public Interval convert(String index) {
   

        return Interval.valueOf(index);
    }
}