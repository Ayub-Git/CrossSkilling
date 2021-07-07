package com.daos;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.model.City;
import com.repos.CityRepo;

@Component
public class CityDaoImpl implements CityDao{
	
	
	
	@Autowired
	private CityRepo cityRepo;
	
	
	@Autowired
	private EntityManager entityManager;

	
	public List<City> fetchAll() {
		
		List<City> cities = null;
		try {
			cities = cityRepo.findAll();
		}
		catch (Exception e) {
		e.printStackTrace();
		}
		return cities;
	
	}
	
@Override
public List<City> fetchAllAgain() {
		
		List<City> cities = null;
		try {
			Query query  = entityManager.createNamedQuery("City.findAll");
			cities = (List<City>) query.getResultList();
		}
		catch (Exception e) {
		e.printStackTrace();
		}
		return cities;
	
	}
	
	
	

}
