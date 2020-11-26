package com.simple.Repository;

import org.springframework.data.repository.CrudRepository;

import com.simple.model.Problem;

public interface ProblemRepo extends CrudRepository<Problem, Integer> {

}
