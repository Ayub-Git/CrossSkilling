package com.daos;

import java.util.List;

import com.entities.Actor;
import com.entities.City;


public interface DaoIntf {
	
	

	List<Actor> fetchAllActors();

	List<City> fetchAllCities();

	Actor createActor(Actor actor);

	void deleteActor(Integer actorId);

	Actor getActor(Integer actorId);

}
