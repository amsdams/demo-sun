package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;
import net.time4j.tz.TZID;
import net.time4j.tz.Timezone;

@RestController
@Slf4j
@RequestMapping("util")
public class UtilRestController {


	

	@GetMapping(value = "/timezones")
	public List<String> timezones() {

		List<TZID> ids = Timezone.getAvailableIDs();
		List<String> timezones = new ArrayList<>();
		timezones.addAll(ids.stream().map(TZID::canonical).collect(Collectors.toList()));
		
		return timezones;
	}
}
