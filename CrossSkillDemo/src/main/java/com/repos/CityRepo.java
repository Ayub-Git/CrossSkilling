package com.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entity.City;
import com.pojos.CityDTO;

@Repository
public interface CityRepo extends JpaRepository<City, Long>{


}
