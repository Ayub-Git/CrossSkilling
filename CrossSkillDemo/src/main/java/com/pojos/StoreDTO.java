package com.pojos;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the store database table.
 * 
 */


public class StoreDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	
	
	private byte storeId;

	
	private Timestamp lastUpdate;

	//bi-directional many-to-one association to Customer
	
	private List<CustomerDTO> customers;

	//bi-directional many-to-one association to Inventory
	
	private List<InventoryDTO> inventories;

	//bi-directional many-to-one association to Staff
	
	private List<StaffDTO> staffs;

	//bi-directional many-to-one association to Address
	
	
	private AddressDTO address;

	//bi-directional many-to-one association to Staff
	
	
	private StaffDTO staff;

	public StoreDTO() {
	}

	public byte getStoreId() {
		return this.storeId;
	}

	public void setStoreId(byte storeId) {
		this.storeId = storeId;
	}

	public Timestamp getLastUpdate() {
		return this.lastUpdate;
	}

	public void setLastUpdate(Timestamp lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	public List<CustomerDTO> getCustomers() {
		return this.customers;
	}

	public void setCustomers(List<CustomerDTO> customers) {
		this.customers = customers;
	}

	public CustomerDTO addCustomer(CustomerDTO customer) {
		getCustomers().add(customer);
		customer.setStore(this);

		return customer;
	}

	public CustomerDTO removeCustomer(CustomerDTO customer) {
		getCustomers().remove(customer);
		customer.setStore(null);

		return customer;
	}

	public List<InventoryDTO> getInventories() {
		return this.inventories;
	}

	public void setInventories(List<InventoryDTO> inventories) {
		this.inventories = inventories;
	}

	public InventoryDTO addInventory(InventoryDTO inventory) {
		getInventories().add(inventory);
		inventory.setStore(this);

		return inventory;
	}

	public InventoryDTO removeInventory(InventoryDTO inventory) {
		getInventories().remove(inventory);
		inventory.setStore(null);

		return inventory;
	}

	public List<StaffDTO> getStaffs() {
		return this.staffs;
	}

	public void setStaffs(List<StaffDTO> staffs) {
		this.staffs = staffs;
	}

	public StaffDTO addStaff(StaffDTO staff) {
		getStaffs().add(staff);
		staff.setStore(this);

		return staff;
	}

	public StaffDTO removeStaff(StaffDTO staff) {
		getStaffs().remove(staff);
		staff.setStore(null);

		return staff;
	}

	public AddressDTO getAddress() {
		return this.address;
	}

	public void setAddress(AddressDTO address) {
		this.address = address;
	}

	public StaffDTO getStaff() {
		return this.staff;
	}

	public void setStaff(StaffDTO staff) {
		this.staff = staff;
	}

}