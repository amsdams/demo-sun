package com.example.demo;

import org.springframework.core.convert.converter.Converter;

import net.time4j.tz.TZID;

public class TZIDToStringConverter implements Converter<TZID, String> {
	 
    @Override
    public String convert(TZID tzid) {

        return tzid.canonical();
    }
}