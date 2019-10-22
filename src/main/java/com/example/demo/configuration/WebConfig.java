package com.example.demo.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.example.demo.StringToLocationConverter;
import com.example.demo.TZIDToStringConverter;

@Configuration
public class WebConfig implements WebMvcConfigurer {
 
    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addConverter(new StringToLocationConverter());
        registry.addConverter(new TZIDToStringConverter());
    }
}
