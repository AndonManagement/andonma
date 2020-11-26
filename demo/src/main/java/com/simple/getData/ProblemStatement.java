package com.simple.getData;

import java.util.ArrayList;

public class ProblemStatement {
	
	String teamName;
	ArrayList<String> Statement;
	
	public ProblemStatement(String teamName, ArrayList<String> statement) {
		super();
		this.teamName = teamName;
		Statement = statement;
	}
	
	
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public ArrayList<String> getStatement() {
		return Statement;
	}
	public void setStatement(ArrayList<String> statement) {
		Statement = statement;
	}
	@Override
	public String toString() {
		return "ProblemStatement [teamName=" + teamName + ", Statement=" + Statement + "]";
	}
	

}
