package com.pojos;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the staff database table.
 * 
 */


public class StaffDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	
	
	private byte staffId;

	private byte active;

	private String email;

	
	private String firstName;

	
	private String lastName;

	
	private Timestamp lastUpdate;

	private String password;

	
	private byte[] picture;

	private String username;

	//bi-directional many-to-one association to Payment
	
	private List<PaymentDTO> payments;

	//bi-directional many-to-one association to Rental
	
	private List<RentalDTO> rentals;

	//bi-directional many-to-one association to Address
	
	
	private AddressDTO address;

	//bi-directional many-to-one association to Store
	
	
	private StoreDTO store;

	//bi-directional many-to-one association to Store
	
	private List<StoreDTO> stores;

	public StaffDTO() {
	}

	public byte getStaffId() {
		return this.staffId;
	}

	public void setStaffId(byte staffId) {
		this.staffId = staffId;
	}

	public byte getActive() {
		return this.active;
	}

	public void setActive(byte active) {
		this.active = active;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Timestamp getLastUpdate() {
		return this.lastUpdate;
	}

	public void setLastUpdate(Timestamp lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public byte[] getPicture() {
		return this.picture;
	}

	public void setPicture(byte[] picture) {
		this.picture = picture;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public List<PaymentDTO> getPayments() {
		return this.payments;
	}

	public void setPayments(List<PaymentDTO> payments) {
		this.payments = payments;
	}

	public PaymentDTO addPayment(PaymentDTO payment) {
		getPayments().add(payment);
		payment.setStaff(this);

		return payment;
	}

	public PaymentDTO removePayment(PaymentDTO payment) {
		getPayments().remove(payment);
		payment.setStaff(null);

		return payment;
	}

	public List<RentalDTO> getRentals() {
		return this.rentals;
	}

	public void setRentals(List<RentalDTO> rentals) {
		this.rentals = rentals;
	}

	public RentalDTO addRental(RentalDTO rental) {
		getRentals().add(rental);
		rental.setStaff(this);

		return rental;
	}

	public RentalDTO removeRental(RentalDTO rental) {
		getRentals().remove(rental);
		rental.setStaff(null);

		return rental;
	}

	public AddressDTO getAddress() {
		return this.address;
	}

	public void setAddress(AddressDTO address) {
		this.address = address;
	}

	public StoreDTO getStore() {
		return this.store;
	}

	public void setStore(StoreDTO store) {
		this.store = store;
	}

	public List<StoreDTO> getStores() {
		return this.stores;
	}

	public void setStores(List<StoreDTO> stores) {
		this.stores = stores;
	}

	public StoreDTO addStore(StoreDTO store) {
		getStores().add(store);
		store.setStaff(this);

		return store;
	}

	public StoreDTO removeStore(StoreDTO store) {
		getStores().remove(store);
		store.setStaff(null);

		return store;
	}

}