package com.pojos;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.sql.Timestamp;


/**
 * The persistent class for the payment database table.
 * 
 */


public class PaymentDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	
	
	private int paymentId;

	private BigDecimal amount;

	
	private Timestamp lastUpdate;

	
	
	private Date paymentDate;

	//bi-directional many-to-one association to Customer
	
	
	private CustomerDTO customer;

	//bi-directional many-to-one association to Rental
	
	
	private RentalDTO rental;

	//bi-directional many-to-one association to Staff
	
	
	private StaffDTO staff;

	public PaymentDTO() {
	}

	public int getPaymentId() {
		return this.paymentId;
	}

	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}

	public BigDecimal getAmount() {
		return this.amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public Timestamp getLastUpdate() {
		return this.lastUpdate;
	}

	public void setLastUpdate(Timestamp lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	public Date getPaymentDate() {
		return this.paymentDate;
	}

	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}

	public CustomerDTO getCustomer() {
		return this.customer;
	}

	public void setCustomer(CustomerDTO customer) {
		this.customer = customer;
	}

	public RentalDTO getRental() {
		return this.rental;
	}

	public void setRental(RentalDTO rental) {
		this.rental = rental;
	}

	public StaffDTO getStaff() {
		return this.staff;
	}

	public void setStaff(StaffDTO staff) {
		this.staff = staff;
	}

}