package com.daos;

import java.util.List;

import com.model.City;
import com.pojos.CityDTO;


public interface CityDao {
	
	
	public List<City> fetchAll();

	List<City> fetchAllAgain();

}