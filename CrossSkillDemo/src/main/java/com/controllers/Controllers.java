package com.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pojos.ActorDTO;
import com.pojos.CityDTO;
import com.services.ServiceIntf;

@RestController
public class Controllers {

	@Autowired
	private ServiceIntf serviceIntf;

	@RequestMapping("/fetchAllCities")
	public List<CityDTO> fetchAllCities() {

		return serviceIntf.fetchAllCities();

	}

	@RequestMapping("/fetchAllActors")
	public List<ActorDTO> fetchAllActors() {

		return serviceIntf.fetchAllActors();

	}
	
	@RequestMapping("/createActor")
	public ActorDTO createActor(@RequestBody ActorDTO actorDTO) {

		return serviceIntf.createActor(actorDTO);

	}
	
	
	@RequestMapping("/deleteActor/{actorId}")
	public ResponseEntity<String> deleteActor(@PathVariable Integer actorId) {
		serviceIntf.deleteActor(actorId);
		return new ResponseEntity<>(HttpStatus.OK);

	}
	
	@RequestMapping("/getActor/{actorId}")
	public ActorDTO getActor(@PathVariable Integer actorId) {

		return serviceIntf.getActor(actorId);

	}
	
	

}
