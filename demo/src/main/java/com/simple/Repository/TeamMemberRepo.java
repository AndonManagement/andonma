package com.simple.Repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.simple.model.TeamMember;

public interface TeamMemberRepo extends CrudRepository<TeamMember, Integer>{
	
	@Query("select q from TeamMember q where q.teamName= :teamName")
	ArrayList<TeamMember> findByTeamName(String teamName);

}
