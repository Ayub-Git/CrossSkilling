package com.pojos;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the language database table.
 * 
 */


public class LanguageDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	
	
	private byte languageId;

	
	private Timestamp lastUpdate;

	private String name;

	//bi-directional many-to-one association to Film
	
	private List<FilmDTO> films1;

	//bi-directional many-to-one association to Film
	
	private List<FilmDTO> films2;

	public LanguageDTO() {
	}

	public byte getLanguageId() {
		return this.languageId;
	}

	public void setLanguageId(byte languageId) {
		this.languageId = languageId;
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

	public List<FilmDTO> getFilms1() {
		return this.films1;
	}

	public void setFilms1(List<FilmDTO> films1) {
		this.films1 = films1;
	}

	public FilmDTO addFilms1(FilmDTO films1) {
		getFilms1().add(films1);
		films1.setLanguage1(this);

		return films1;
	}

	public FilmDTO removeFilms1(FilmDTO films1) {
		getFilms1().remove(films1);
		films1.setLanguage1(null);

		return films1;
	}

	public List<FilmDTO> getFilms2() {
		return this.films2;
	}

	public void setFilms2(List<FilmDTO> films2) {
		this.films2 = films2;
	}

	public FilmDTO addFilms2(FilmDTO films2) {
		getFilms2().add(films2);
		films2.setLanguage2(this);

		return films2;
	}

	public FilmDTO removeFilms2(FilmDTO films2) {
		getFilms2().remove(films2);
		films2.setLanguage2(null);

		return films2;
	}

}