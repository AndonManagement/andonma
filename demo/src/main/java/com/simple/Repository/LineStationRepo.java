package com.simple.Repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.simple.model.LineStation;
import com.simple.model.TeamMember;

public interface LineStationRepo extends CrudRepository<LineStation, Integer>{
	
	@Query("select q from LineStation q where q.lineNumber= :lineNo")
	LineStation findByLineNumber(int lineNo);
	
	

}
