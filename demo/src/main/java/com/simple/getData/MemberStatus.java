package com.simple.getData;

public class MemberStatus {
	
	String teamName;
	int workingCount;
	int totalCount;
	int availableCount;
	
	public MemberStatus() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MemberStatus(String teamName, int workingCount, int totalCount, int availableCount) {
		super();
		this.teamName = teamName;
		this.workingCount = workingCount;
		this.totalCount = totalCount;
		this.availableCount = availableCount;
	}
	
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
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
	
	

}
