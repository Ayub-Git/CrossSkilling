package com.services;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.daos.DaoIntf;
import com.entities.Actor;
import com.entities.City;
import com.pojos.ActorDTO;
import com.pojos.CityDTO;

@Service
public class ServiceImpl implements ServiceIntf {

	@Autowired
	private DaoIntf daoIntf;

	@Autowired
	public List<CityDTO> fetchAllCities() {

		List<CityDTO> cityDTOs = new ArrayList<>();
		try {
			daoIntf.fetchAllCities().stream().forEach(record -> {
				CityDTO cityDTO = new CityDTO();
				BeanUtils.copyProperties(record, cityDTO);
				cityDTOs.add(cityDTO);

			});
		} catch (Exception e) {
			e.printStackTrace();
		}
		return cityDTOs;

	}

	@Override
	public List<ActorDTO> fetchAllActors() {

		List<ActorDTO> actorDTOs = new ArrayList<>();
		try {
			daoIntf.fetchAllActors().stream().forEach(record -> {
				ActorDTO actorDTO = new ActorDTO();
				BeanUtils.copyProperties(record, actorDTO);
				actorDTOs.add(actorDTO);

			});
		} catch (Exception e) {
			e.printStackTrace();
		}
		return actorDTOs;

	}

	@Override
	public ActorDTO createActor(ActorDTO actorDTO) {
		
		Actor actor	 = new Actor();
		BeanUtils.copyProperties(actorDTO, actor);		
		actor.setLastUpdate(new Timestamp(new Date().getTime()));	
		BeanUtils.copyProperties( daoIntf.createActor(actor), actorDTO);		
		return actorDTO;
	}

	@Override
	public void deleteActor(Integer actorId) {
		 daoIntf.deleteActor(actorId);
	}

	@Override
	public ActorDTO getActor(Integer actorId) {
		
		ActorDTO actorDTO	 = new ActorDTO();
		BeanUtils.copyProperties( daoIntf.getActor(actorId), actorDTO);		
		return actorDTO;
	}

	
	
	
	
	
	
	
	
	
	
	
	

}
