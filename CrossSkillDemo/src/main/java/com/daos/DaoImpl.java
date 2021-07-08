package com.daos;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.entities.Actor;
import com.entities.City;
import com.repos.ActorRepo;
import com.repos.CityRepo;

@Component
public class DaoImpl implements DaoIntf {

	@Autowired
	private CityRepo cityRepo;
	
	@Autowired
	private ActorRepo actorRepo;

	@Autowired
	private EntityManager entityManager;

	@Override
	public List<City> fetchAllCities() {

		List<City> cities = null;
		try {
			cities = cityRepo.findAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return cities;

	}

	@Override
	public Actor createActor(Actor actor) {
		try {
		actor = actorRepo.save(actor);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return actor;
	}

	@Override
	public List<Actor> fetchAllActors() {

		List<Actor> cities = null;
		try {
			Query query = entityManager.createNamedQuery("Actor.findAll");
			cities = (List<Actor>) query.getResultList();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return cities;

	}

	@Override
	public void deleteActor(Integer actorId) {

		try {
			 actorRepo.delete(getActor(actorId));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public Actor getActor(Integer actorId) {
		Actor actor = null;
		try {
		actor = actorRepo.findById(actorId).get();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return actor;
	}
	
	
	
	
	
	
	
	

}
