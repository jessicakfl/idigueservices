package com.idigue.services.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.idigue.data.Country;

@RestController
public class Cities {
	private static final List<Country> countries=List.of(
			new Country("u", "123"),
			new Country("c", "22"));
	@RequestMapping("api/v1/countries")
	public List<Country> getCountires(){
		return countries;
	}

}
