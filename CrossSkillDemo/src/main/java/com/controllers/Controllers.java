package com.controllers;

import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.daos.CityDao;
import com.pojos.ActorDTO;
import com.pojos.CityDTO;
import com.services.CityService;

@RestController
public class Controllers {
	
	@Autowired
	private CityService cityService;
	
	
	@RequestMapping("/index")
	public List<ActorDTO> getAllActors(HttpServletRequest request) throws MalformedURLException{
		List<ActorDTO> actors = setData();
		URL hp = new URL(getFullURL(request));
		System.out.println("Protocol: " + hp.getProtocol());
		System.out.println("Port: " + hp.getPort());
		System.out.println("Host: " + hp.getHost());
		System.out.println("File: " + hp.getFile());
		System.out.println("Ext:" + hp.toExternalForm());
	//	sendMail();
		return actors;
	}
	
	
	@RequestMapping("/fetchAllCities")
	public List<CityDTO> getAllCities() {
		
		return cityService.fetchAll();
		
		
	}
	@RequestMapping("/fetchAllCitiesAgain")
	public List<CityDTO> fetchAllCitiesAgain() {
		
		return cityService.fetchAllAgain();
		
		
	}
	
	
	
	
	
	
	public  String getFullURL(HttpServletRequest request) {
	    StringBuilder requestURL = new StringBuilder(request.getRequestURL().toString());
	    String queryString = request.getQueryString();

	    if (queryString == null) {
	        return requestURL.toString();
	    } else {
	        return requestURL.append('?').append(queryString).toString();
	    }
	}
	
	private List<ActorDTO> setData() {
		List<ActorDTO> actors = new ArrayList<>();
		ActorDTO actor1 = new ActorDTO();
		actor1.setActorId(2);
		actor1.setFirstName("Ayub");
		actor1.setLastName("Ahmed");
		actor1.setLastUpdate(new Timestamp(System.currentTimeMillis()));
		ActorDTO actor2 = new ActorDTO();
		actor2.setActorId(1);
		actor2.setFirstName("Noor");
		actor2.setLastUpdate(new Timestamp(System.currentTimeMillis()+System.currentTimeMillis()));
		actors.add(actor1);
		actors.add(actor2);
		return actors;
	}
	
	
}
