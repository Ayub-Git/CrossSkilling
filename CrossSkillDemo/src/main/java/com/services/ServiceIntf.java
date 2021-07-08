package com.services;

import java.util.List;

import com.pojos.ActorDTO;
import com.pojos.CityDTO;

public interface ServiceIntf {
	
	List<ActorDTO> fetchAllActors();

	List<CityDTO> fetchAllCities();

	ActorDTO createActor(ActorDTO actorDTO);

	void deleteActor(Integer actorId);

	ActorDTO getActor(Integer actorId);


}
