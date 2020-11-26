package com.simple.postData;

import java.util.Date;

public class SET_USER {
	
	int lineNumber ;
	int stationNumber ;
	String selectedDate ;
	String selectedVariant ;
	String serialNumber;
	String dept ;
	String problem ;
	
	
	
	public SET_USER(int lineNumber, int stationNumber, String selectedDate, String selectedVariant, String serialNumber,
			String dept, String problem) {
		super();
		this.lineNumber = lineNumber;
		this.stationNumber = stationNumber;
		this.selectedDate = selectedDate;
		this.selectedVariant = selectedVariant;
		this.serialNumber = serialNumber;
		this.dept = dept;
		this.problem = problem;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}


	public int getLineNumber() {
		return lineNumber;
	}

	public void setLineNumber(int lineNumber) {
		this.lineNumber = lineNumber;
	}

	public int getStationNumber() {
		return stationNumber;
	}

	public void setStationNumber(int stationNumber) {
		this.stationNumber = stationNumber;
	}

	public String getSelectedDate() {
		return selectedDate;
	}

	public void setSelectedDate(String selectedDate) {
		this.selectedDate = selectedDate;
	}

	public String getSelectedVariant() {
		return selectedVariant;
	}

	public void setSelectedVariant(String selectedVariant) {
		this.selectedVariant = selectedVariant;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getProblem() {
		return problem;
	}

	public void setProblem(String problem) {
		this.problem = problem;
	}
	
	

}
