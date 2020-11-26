package com.simple.model;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Team {
	
	@Id
	int id;
	String name;
	
	int workingCount;
	int totalCount;
	int availableCount;

	ArrayList<String> problemStatement = new ArrayList();
	
	

	public Team() {
		
	}

	public Team(int id, String name, int workingCount, int totalCount, int availableCount,
		ArrayList<String> problemStatement) {
		super();
		this.id = id;
		this.name = name;
		this.workingCount = workingCount;
		this.totalCount = totalCount;
		this.availableCount = availableCount;
		this.problemStatement = problemStatement;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWorkingCount() {
		return workingCount;
	}

	public void setWorkingCount(int workingCount) {
		this.workingCount = workingCount;
	}

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

	public int getAvailableCount() {
		return availableCount;
	}

	public void setAvailableCount(int availableCount) {
		this.availableCount = availableCount;
	}

	
	public ArrayList<String> getProblemStatement() {
		return problemStatement;
	}

	public void setProblemStatement(ArrayList<String> problemStatement) {
		this.problemStatement = problemStatement;
	}

	@Override
	public String toString() {
		return "Team [id=" + id + ", name=" + name + ", workingCount=" + workingCount + ", totalCount=" + totalCount
				+ ", availableCount=" + availableCount + ", members=" + ", problemStatement="
				+ problemStatement + "]";
	}
	
	

}
