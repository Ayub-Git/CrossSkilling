package com.pojos;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the film_category database table.
 * 
 */



public class FilmCategoryDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	
	private FilmCategoryPKDTO id;

	
	private Timestamp lastUpdate;

	//bi-directional many-to-one association to Category
	
	
	private CategoryDTO category;

	//bi-directional many-to-one association to Film
	
	
	private FilmDTO film;

	public FilmCategoryDTO() {
	}

	public FilmCategoryPKDTO getId() {
		return this.id;
	}

	public void setId(FilmCategoryPKDTO id) {
		this.id = id;
	}

	public Timestamp getLastUpdate() {
		return this.lastUpdate;
	}

	public void setLastUpdate(Timestamp lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	public CategoryDTO getCategory() {
		return this.category;
	}

	public void setCategory(CategoryDTO category) {
		this.category = category;
	}

	public FilmDTO getFilm() {
		return this.film;
	}

	public void setFilm(FilmDTO film) {
		this.film = film;
	}

}