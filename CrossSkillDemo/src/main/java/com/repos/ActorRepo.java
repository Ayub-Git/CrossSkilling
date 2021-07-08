package com.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entities.Actor;

@Repository
public interface ActorRepo extends JpaRepository<Actor, Integer>{


}
