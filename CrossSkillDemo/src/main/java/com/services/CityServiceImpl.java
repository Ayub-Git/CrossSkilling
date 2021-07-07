package com.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.daos.CityDao;
import com.pojos.CityDTO;

@Service
public class CityServiceImpl implements CityService{

	
	@Autowired
	private CityDao cityDao;
	
	public List<CityDTO> fetchAll() {
		
		
		List<CityDTO> cityDTOs = new ArrayList<>();
		try {
			cityDao.fetchAll().stream().forEach( record-> {
				CityDTO cityDTO = new CityDTO();
				BeanUtils.copyProperties(record, cityDTO);
				cityDTOs.add(cityDTO);
				
			});
		}
		catch (Exception e) {
		e.printStackTrace();
		}
		return cityDTOs;
	
	
	}
@Override
public List<CityDTO> fetchAllAgain() {
		
		
		List<CityDTO> cityDTOs = new ArrayList<>();
		try {
			cityDao.fetchAllAgain().stream().forEach( record-> {
				CityDTO cityDTO = new CityDTO();
				BeanUtils.copyProperties(record, cityDTO);
				cityDTOs.add(cityDTO);
				
			});
		}
		catch (Exception e) {
		e.printStackTrace();
		}
		return cityDTOs;
	
	
	}

}
