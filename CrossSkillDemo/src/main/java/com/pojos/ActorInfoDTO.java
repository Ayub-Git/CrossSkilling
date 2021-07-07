package com.pojos;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the actor_info database table.
 * 
 */



public class ActorInfoDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	
	private int actorId;

	
	
	private String filmInfo;

	
	private String firstName;

	
	private String lastName;

	public ActorInfoDTO() {
	}

	public int getActorId() {
		return this.actorId;
	}

	public void setActorId(int actorId) {
		this.actorId = actorId;
	}

	public String getFilmInfo() {
		return this.filmInfo;
	}

	public void setFilmInfo(String filmInfo) {
		this.filmInfo = filmInfo;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}