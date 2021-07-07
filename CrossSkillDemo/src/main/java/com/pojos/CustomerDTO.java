package com.pojos;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the customer database table.
 * 
 */


public class CustomerDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	
	
	private int customerId;

	private byte active;

	
	
	private Date createDate;

	private String email;

	
	private String firstName;

	
	private String lastName;

	
	private Timestamp lastUpdate;

	//bi-directional many-to-one association to Address
	
	
	private AddressDTO address;

	//bi-directional many-to-one association to Store
	
	
	private StoreDTO store;

	//bi-directional many-to-one association to Payment
	
	private List<PaymentDTO> payments;

	//bi-directional many-to-one association to Rental
	
	private List<RentalDTO> rentals;

	public CustomerDTO() {
	}

	public int getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public byte getActive() {
		return this.active;
	}

	public void setActive(byte active) {
		this.active = active;
	}

	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
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

	public List<PaymentDTO> getPayments() {
		return this.payments;
	}

	public void setPayments(List<PaymentDTO> payments) {
		this.payments = payments;
	}

	public PaymentDTO addPayment(PaymentDTO payment) {
		getPayments().add(payment);
		payment.setCustomer(this);

		return payment;
	}

	public PaymentDTO removePayment(PaymentDTO payment) {
		getPayments().remove(payment);
		payment.setCustomer(null);

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
		rental.setCustomer(this);

		return rental;
	}

	public RentalDTO removeRental(RentalDTO rental) {
		getRentals().remove(rental);
		rental.setCustomer(null);

		return rental;
	}

}