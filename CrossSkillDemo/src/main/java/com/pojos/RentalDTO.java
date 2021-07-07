package com.pojos;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the rental database table.
 * 
 */


public class RentalDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	
	
	private int rentalId;

	
	private Timestamp lastUpdate;

	
	
	private Date rentalDate;

	
	
	private Date returnDate;

	//bi-directional many-to-one association to Payment
	
	private List<PaymentDTO> payments;

	//bi-directional many-to-one association to Customer
	
	
	private CustomerDTO customer;

	//bi-directional many-to-one association to Inventory
	
	
	private InventoryDTO inventory;

	//bi-directional many-to-one association to Staff
	
	
	private StaffDTO staff;

	public RentalDTO() {
	}

	public int getRentalId() {
		return this.rentalId;
	}

	public void setRentalId(int rentalId) {
		this.rentalId = rentalId;
	}

	public Timestamp getLastUpdate() {
		return this.lastUpdate;
	}

	public void setLastUpdate(Timestamp lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	public Date getRentalDate() {
		return this.rentalDate;
	}

	public void setRentalDate(Date rentalDate) {
		this.rentalDate = rentalDate;
	}

	public Date getReturnDate() {
		return this.returnDate;
	}

	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}

	public List<PaymentDTO> getPayments() {
		return this.payments;
	}

	public void setPayments(List<PaymentDTO> payments) {
		this.payments = payments;
	}

	public PaymentDTO addPayment(PaymentDTO payment) {
		getPayments().add(payment);
		payment.setRental(this);

		return payment;
	}

	public PaymentDTO removePayment(PaymentDTO payment) {
		getPayments().remove(payment);
		payment.setRental(null);

		return payment;
	}

	public CustomerDTO getCustomer() {
		return this.customer;
	}

	public void setCustomer(CustomerDTO customer) {
		this.customer = customer;
	}

	public InventoryDTO getInventory() {
		return this.inventory;
	}

	public void setInventory(InventoryDTO inventory) {
		this.inventory = inventory;
	}

	public StaffDTO getStaff() {
		return this.staff;
	}

	public void setStaff(StaffDTO staff) {
		this.staff = staff;
	}

}