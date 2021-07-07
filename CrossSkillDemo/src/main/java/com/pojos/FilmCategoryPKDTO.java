package com.pojos;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the film_category database table.
 * 
 */

public class FilmCategoryPKDTO implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	
	private int filmId;

	
	private byte categoryId;

	public FilmCategoryPKDTO() {
	}
	public int getFilmId() {
		return this.filmId;
	}
	public void setFilmId(int filmId) {
		this.filmId = filmId;
	}
	public byte getCategoryId() {
		return this.categoryId;
	}
	public void setCategoryId(byte categoryId) {
		this.categoryId = categoryId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof FilmCategoryPKDTO)) {
			return false;
		}
		FilmCategoryPKDTO castOther = (FilmCategoryPKDTO)other;
		return 
			(this.filmId == castOther.filmId)
			&& (this.categoryId == castOther.categoryId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.filmId;
		hash = hash * prime + ((int) this.categoryId);
		
		return hash;
	}
}