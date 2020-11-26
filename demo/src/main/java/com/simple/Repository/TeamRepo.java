package com.simple.Repository;

import org.springframework.data.repository.CrudRepository;

import com.simple.model.Team;

public interface TeamRepo extends CrudRepository<Team, Integer>{

}
