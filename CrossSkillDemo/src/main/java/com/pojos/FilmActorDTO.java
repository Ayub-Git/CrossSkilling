package com.pojos;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the film_actor database table.
 * 
 */



public class FilmActorDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	
	private FilmActorPKDTO id;

	
	private Timestamp lastUpdate;

	//bi-directional many-to-one association to Actor
	
	
	private ActorDTO actor;

	//bi-directional many-to-one association to Film
	
	
	private FilmDTO film;

	public FilmActorDTO() {
	}

	public FilmActorPKDTO getId() {
		return this.id;
	}

	public void setId(FilmActorPKDTO id) {
		this.id = id;
	}

	public Timestamp getLastUpdate() {
		return this.lastUpdate;
	}

	public void setLastUpdate(Timestamp lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	public ActorDTO getActor() {
		return this.actor;
	}

	public void setActor(ActorDTO actor) {
		this.actor = actor;
	}

	public FilmDTO getFilm() {
		return this.film;
	}

	public void setFilm(FilmDTO film) {
		this.film = film;
	}

}