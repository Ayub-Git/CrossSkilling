package com.pojos;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the address database table.
 * 
 */


public class AddressDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	
	
	private int addressId;

	private String address;

	private String address2;

	private String district;

	
	private Timestamp lastUpdate;

	private Object location;

	private String phone;

	
	private String postalCode;

	//bi-directional many-to-one association to City
	
	
	private CityDTO city;

	//bi-directional many-to-one association to Customer
	
	private List<CustomerDTO> customers;

	//bi-directional many-to-one association to Staff
	
	private List<StaffDTO> staffs;

	//bi-directional many-to-one association to Store
	
	private List<StoreDTO> stores;

	public AddressDTO() {
	}

	public int getAddressId() {
		return this.addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAddress2() {
		return this.address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getDistrict() {
		return this.district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public Timestamp getLastUpdate() {
		return this.lastUpdate;
	}

	public void setLastUpdate(Timestamp lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	public Object getLocation() {
		return this.location;
	}

	public void setLocation(Object location) {
		this.location = location;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPostalCode() {
		return this.postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public CityDTO getCity() {
		return this.city;
	}

	public void setCity(CityDTO city) {
		this.city = city;
	}

	public List<CustomerDTO> getCustomers() {
		return this.customers;
	}

	public void setCustomers(List<CustomerDTO> customers) {
		this.customers = customers;
	}

	public CustomerDTO addCustomer(CustomerDTO customer) {
		getCustomers().add(customer);
		customer.setAddress(this);

		return customer;
	}

	public CustomerDTO removeCustomer(CustomerDTO customer) {
		getCustomers().remove(customer);
		customer.setAddress(null);

		return customer;
	}

	public List<StaffDTO> getStaffs() {
		return this.staffs;
	}

	public void setStaffs(List<StaffDTO> staffs) {
		this.staffs = staffs;
	}

	public StaffDTO addStaff(StaffDTO staff) {
		getStaffs().add(staff);
		staff.setAddress(this);

		return staff;
	}

	public StaffDTO removeStaff(StaffDTO staff) {
		getStaffs().remove(staff);
		staff.setAddress(null);

		return staff;
	}

	public List<StoreDTO> getStores() {
		return this.stores;
	}

	public void setStores(List<StoreDTO> stores) {
		this.stores = stores;
	}

	public StoreDTO addStore(StoreDTO store) {
		getStores().add(store);
		store.setAddress(this);

		return store;
	}

	public StoreDTO removeStore(StoreDTO store) {
		getStores().remove(store);
		store.setAddress(null);

		return store;
	}

}