package com.simple.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class TeamMember {
	
	@Id
	int memberId;
	String name;
	String email;
	String teamName;
	
	public String getTeam() {
		return teamName;
	}



	public void setTeam(String team) {
		this.teamName = team;
	}



	public TeamMember(int memberId, String name, String email,String teamName) {
		super();
		this.memberId = memberId;
		this.name = name;
		this.email = email;
		this.teamName = teamName;
	}
	
	
	
	public TeamMember() {
		
	}



	public int getMemberId() {
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "TeamMember [memberId=" + memberId + ", name=" + name + ", email=" + email + ", teamName=" 
				+ "]";
	}
	

}
