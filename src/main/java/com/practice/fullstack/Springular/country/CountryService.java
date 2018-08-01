package com.practice.fullstack.Springular.country;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountryService {
	
	@Autowired 
	private CountryRepository countryRepository;

	public List<Country> getAllCountries() {
		List<Country> countries = new ArrayList<>();
		countryRepository.findAll()
			.forEach(countries::add);
		return countries;		
	}

	public void addCountry(Country country) {
		countryRepository.save(country);
	}

	public Country getCountry(String id) {
		return countryRepository.findById(id).orElse(null);
	}
}
