package com.practice.fullstack.Springular.country;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController {
	
	@Autowired
	private CountryService countryService;
	
	@GetMapping("/countries")
	public List<Country> getAllCountries() {
		return countryService.getAllCountries();
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/countries/{id}")
	public Country getCountry(@PathVariable String id) {
		return countryService.getCountry(id);
	}
	
	@PostMapping("/countries")
	public void addCountry(@RequestBody Country country) {
		countryService.addCountry(country);
	}
}
