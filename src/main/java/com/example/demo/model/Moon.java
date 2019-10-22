package com.example.demo.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import net.time4j.tz.TZID;

@Data
@AllArgsConstructor
public class Moon {
	private LocalDate date;
	private LocalDateTime rise;
	private LocalDateTime set;
	@JsonIgnore
	private TZID tzid;
	private Location location;

	@JsonProperty("timezone")
	public String getTimezone() {
		return tzid.canonical();
	}
}
