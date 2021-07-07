package com.pojos;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the country database table.
 * 
 */


public class CountryDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	
	
	private int countryId;

	private String country;

	
	private Timestamp lastUpdate;

	//bi-directional many-to-one association to City
	
	private List<CityDTO> cities;

	public CountryDTO() {
	}

	public int getCountryId() {
		return this.countryId;
	}

	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Timestamp getLastUpdate() {
		return this.lastUpdate;
	}

	public void setLastUpdate(Timestamp lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	public List<CityDTO> getCities() {
		return this.cities;
	}

	public void setCities(List<CityDTO> cities) {
		this.cities = cities;
	}

	public CityDTO addCity(CityDTO city) {
		getCities().add(city);
		city.setCountry(this);

		return city;
	}

	public CityDTO removeCity(CityDTO city) {
		getCities().remove(city);
		city.setCountry(null);

		return city;
	}

}