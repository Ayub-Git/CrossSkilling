package com.pojos;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the film_actor database table.
 * 
 */

public class FilmActorPKDTO implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	
	private int actorId;

	
	private int filmId;

	public FilmActorPKDTO() {
	}
	public int getActorId() {
		return this.actorId;
	}
	public void setActorId(int actorId) {
		this.actorId = actorId;
	}
	public int getFilmId() {
		return this.filmId;
	}
	public void setFilmId(int filmId) {
		this.filmId = filmId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof FilmActorPKDTO)) {
			return false;
		}
		FilmActorPKDTO castOther = (FilmActorPKDTO)other;
		return 
			(this.actorId == castOther.actorId)
			&& (this.filmId == castOther.filmId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.actorId;
		hash = hash * prime + this.filmId;
		
		return hash;
	}
}