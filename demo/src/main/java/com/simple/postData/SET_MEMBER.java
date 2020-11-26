package com.simple.postData;

public class SET_MEMBER {
	
	String selectedMember;
	String selectedStartTime;
	String selectedEndTime;
	
	
	public SET_MEMBER() {
		super();
		// TODO Auto-generated constructor stub
	}


	public SET_MEMBER(String selectedMember, String selectedStartTime, String selectedEndTime) {
		super();
		this.selectedMember = selectedMember;
		this.selectedStartTime = selectedStartTime;
		this.selectedEndTime = selectedEndTime;
	}


	public String getSelectedMember() {
		return selectedMember;
	}


	public void setSelectedMember(String selectedMember) {
		this.selectedMember = selectedMember;
	}


	public String getSelectedStartTime() {
		return selectedStartTime;
	}


	public void setSelectedStartTime(String selectedStartTime) {
		this.selectedStartTime = selectedStartTime;
	}


	public String getSelectedEndTime() {
		return selectedEndTime;
	}


	public void setSelectedEndTime(String selectedEndTime) {
		this.selectedEndTime = selectedEndTime;
	}
	
	
	
	

}
