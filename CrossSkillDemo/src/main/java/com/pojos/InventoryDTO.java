package com.pojos;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the inventory database table.
 * 
 */


public class InventoryDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	
	
	private int inventoryId;

	
	private Timestamp lastUpdate;

	//bi-directional many-to-one association to Film
	
	
	private FilmDTO film;

	//bi-directional many-to-one association to Store
	
	
	private StoreDTO store;

	//bi-directional many-to-one association to Rental
	
	private List<RentalDTO> rentals;

	public InventoryDTO() {
	}

	public int getInventoryId() {
		return this.inventoryId;
	}

	public void setInventoryId(int inventoryId) {
		this.inventoryId = inventoryId;
	}

	public Timestamp getLastUpdate() {
		return this.lastUpdate;
	}

	public void setLastUpdate(Timestamp lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	public FilmDTO getFilm() {
		return this.film;
	}

	public void setFilm(FilmDTO film) {
		this.film = film;
	}

	public StoreDTO getStore() {
		return this.store;
	}

	public void setStore(StoreDTO store) {
		this.store = store;
	}

	public List<RentalDTO> getRentals() {
		return this.rentals;
	}

	public void setRentals(List<RentalDTO> rentals) {
		this.rentals = rentals;
	}

	public RentalDTO addRental(RentalDTO rental) {
		getRentals().add(rental);
		rental.setInventory(this);

		return rental;
	}

	public RentalDTO removeRental(RentalDTO rental) {
		getRentals().remove(rental);
		rental.setInventory(null);

		return rental;
	}

}