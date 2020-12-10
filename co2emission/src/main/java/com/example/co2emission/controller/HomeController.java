package com.example.co2emission.controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HomeController {
	@RequestMapping("/")
	public String index() {
		return "CO2 levels application";
	}
	
	@RequestMapping("/get_co2_emissions_by_districts")
	public String get_co2_emissions() {
		return "CO2 emissions by districts";
	}
	
	@RequestMapping("/get_co2_emissions_by_cities")
	public String get_co2_emissions_by_cities() {
		return "CO2 emissions by cities";
	}
}
