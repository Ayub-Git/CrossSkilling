package com.services;

import java.util.List;

import com.pojos.CityDTO;

public interface CityService {
	
	public List<CityDTO> fetchAll();

	List<CityDTO> fetchAllAgain();


}
