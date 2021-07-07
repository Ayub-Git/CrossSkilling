package com.pojos;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the category database table.
 * 
 */


public class CategoryDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	
	
	private byte categoryId;

	
	private Timestamp lastUpdate;

	private String name;

	//bi-directional many-to-one association to FilmCategory
	
	private List<FilmCategoryDTO> filmCategories;

	public CategoryDTO() {
	}

	public byte getCategoryId() {
		return this.categoryId;
	}

	public void setCategoryId(byte categoryId) {
		this.categoryId = categoryId;
	}

	public Timestamp getLastUpdate() {
		return this.lastUpdate;
	}

	public void setLastUpdate(Timestamp lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<FilmCategoryDTO> getFilmCategories() {
		return this.filmCategories;
	}

	public void setFilmCategories(List<FilmCategoryDTO> filmCategories) {
		this.filmCategories = filmCategories;
	}

	public FilmCategoryDTO addFilmCategory(FilmCategoryDTO filmCategory) {
		getFilmCategories().add(filmCategory);
		filmCategory.setCategory(this);

		return filmCategory;
	}

	public FilmCategoryDTO removeFilmCategory(FilmCategoryDTO filmCategory) {
		getFilmCategories().remove(filmCategory);
		filmCategory.setCategory(null);

		return filmCategory;
	}

}