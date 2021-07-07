package com.pojos;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the film_text database table.
 * 
 */



public class FilmTextDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	
	
	private short filmId;

	
	private String description;

	private String title;

	public FilmTextDTO() {
	}

	public short getFilmId() {
		return this.filmId;
	}

	public void setFilmId(short filmId) {
		this.filmId = filmId;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}