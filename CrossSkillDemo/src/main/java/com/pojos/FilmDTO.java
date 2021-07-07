package com.pojos;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the film database table.
 * 
 */


public class FilmDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	
	
	private int filmId;

	
	private String description;

	
	private Timestamp lastUpdate;

	private int length;

	private String rating;

	
	
	private Date releaseYear;

	
	private byte rentalDuration;

	
	private BigDecimal rentalRate;

	
	private BigDecimal replacementCost;

	
	private Object specialFeatures;

	private String title;

	//bi-directional many-to-one association to Language
	
	
	private LanguageDTO language1;

	//bi-directional many-to-one association to Language
	
	
	private LanguageDTO language2;

	//bi-directional many-to-one association to FilmActor
	
	private List<FilmActorDTO> filmActors;

	//bi-directional many-to-one association to FilmCategory
	
	private List<FilmCategoryDTO> filmCategories;

	//bi-directional many-to-one association to Inventory
	
	private List<InventoryDTO> inventories;

	public FilmDTO() {
	}

	public int getFilmId() {
		return this.filmId;
	}

	public void setFilmId(int filmId) {
		this.filmId = filmId;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Timestamp getLastUpdate() {
		return this.lastUpdate;
	}

	public void setLastUpdate(Timestamp lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	public int getLength() {
		return this.length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public String getRating() {
		return this.rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public Date getReleaseYear() {
		return this.releaseYear;
	}

	public void setReleaseYear(Date releaseYear) {
		this.releaseYear = releaseYear;
	}

	public byte getRentalDuration() {
		return this.rentalDuration;
	}

	public void setRentalDuration(byte rentalDuration) {
		this.rentalDuration = rentalDuration;
	}

	public BigDecimal getRentalRate() {
		return this.rentalRate;
	}

	public void setRentalRate(BigDecimal rentalRate) {
		this.rentalRate = rentalRate;
	}

	public BigDecimal getReplacementCost() {
		return this.replacementCost;
	}

	public void setReplacementCost(BigDecimal replacementCost) {
		this.replacementCost = replacementCost;
	}

	public Object getSpecialFeatures() {
		return this.specialFeatures;
	}

	public void setSpecialFeatures(Object specialFeatures) {
		this.specialFeatures = specialFeatures;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public LanguageDTO getLanguage1() {
		return this.language1;
	}

	public void setLanguage1(LanguageDTO language1) {
		this.language1 = language1;
	}

	public LanguageDTO getLanguage2() {
		return this.language2;
	}

	public void setLanguage2(LanguageDTO language2) {
		this.language2 = language2;
	}

	public List<FilmActorDTO> getFilmActors() {
		return this.filmActors;
	}

	public void setFilmActors(List<FilmActorDTO> filmActors) {
		this.filmActors = filmActors;
	}

	public FilmActorDTO addFilmActor(FilmActorDTO filmActor) {
		getFilmActors().add(filmActor);
		filmActor.setFilm(this);

		return filmActor;
	}

	public FilmActorDTO removeFilmActor(FilmActorDTO filmActor) {
		getFilmActors().remove(filmActor);
		filmActor.setFilm(null);

		return filmActor;
	}

	public List<FilmCategoryDTO> getFilmCategories() {
		return this.filmCategories;
	}

	public void setFilmCategories(List<FilmCategoryDTO> filmCategories) {
		this.filmCategories = filmCategories;
	}

	public FilmCategoryDTO addFilmCategory(FilmCategoryDTO filmCategory) {
		getFilmCategories().add(filmCategory);
		filmCategory.setFilm(this);

		return filmCategory;
	}

	public FilmCategoryDTO removeFilmCategory(FilmCategoryDTO filmCategory) {
		getFilmCategories().remove(filmCategory);
		filmCategory.setFilm(null);

		return filmCategory;
	}

	public List<InventoryDTO> getInventories() {
		return this.inventories;
	}

	public void setInventories(List<InventoryDTO> inventories) {
		this.inventories = inventories;
	}

	public InventoryDTO addInventory(InventoryDTO inventory) {
		getInventories().add(inventory);
		inventory.setFilm(this);

		return inventory;
	}

	public InventoryDTO removeInventory(InventoryDTO inventory) {
		getInventories().remove(inventory);
		inventory.setFilm(null);

		return inventory;
	}

}