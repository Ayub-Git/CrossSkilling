package com.pojos;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the city database table.
 * 
 */


public class CityDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	
	
	private int cityId;

	private String city;

	
	private Timestamp lastUpdate;

	//bi-directional many-to-one association to Address
	
	private List<AddressDTO> addresses;

	//bi-directional many-to-one association to Country
	
	
	private CountryDTO country;

	public CityDTO() {
	}

	public int getCityId() {
		return this.cityId;
	}

	public void setCityId(int cityId) {
		this.cityId = cityId;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Timestamp getLastUpdate() {
		return this.lastUpdate;
	}

	public void setLastUpdate(Timestamp lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	public List<AddressDTO> getAddresses() {
		return this.addresses;
	}

	public void setAddresses(List<AddressDTO> addresses) {
		this.addresses = addresses;
	}

	public AddressDTO addAddress(AddressDTO address) {
		getAddresses().add(address);
		address.setCity(this);

		return address;
	}

	public AddressDTO removeAddress(AddressDTO address) {
		getAddresses().remove(address);
		address.setCity(null);

		return address;
	}

	public CountryDTO getCountry() {
		return this.country;
	}

	public void setCountry(CountryDTO country) {
		this.country = country;
	}

}