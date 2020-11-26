package com.simple.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Problem {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int incidentNo;
	
	private String  incidentDescription;
	private int lineNumber;
	private int stationNumber;
	private String variant;	
	private String serialNumber;
	String problem;
	String solution;
	String operatorName;
	String startTime;
	String submissionTime;
	String endTime;
	private String  date;
	String dept;
	
	
	
	
	public Problem() {
		
	}




	public Problem(int incidentNo, String incidentDescription, int lineNumber, int stationNumber, String variant,
			String serialNumber, String problem, String solution, String operatorName, String startTime,
			String submissionTime, String endTime, String date, String dept) {
		super();
		this.incidentNo = incidentNo;
		this.incidentDescription = incidentDescription;
		this.lineNumber = lineNumber;
		this.stationNumber = stationNumber;
		this.variant = variant;
		this.serialNumber = serialNumber;
		this.problem = problem;
		this.solution = solution;
		this.operatorName = operatorName;
		this.startTime = startTime;
		this.submissionTime = submissionTime;
		this.endTime = endTime;
		this.date = date;
		this.dept = dept;
	}




	public int getIncidentNo() {
		return incidentNo;
	}




	public void setIncidentNo(int incidentNo) {
		this.incidentNo = incidentNo;
	}




	public String getIncidentDescription() {
		return incidentDescription;
	}




	public void setIncidentDescription(String incidentDescription) {
		this.incidentDescription = incidentDescription;
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




	public String getVariant() {
		return variant;
	}




	public void setVariant(String variant) {
		this.variant = variant;
	}




	public String getSerialNumber() {
		return serialNumber;
	}




	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}




	public String getProblem() {
		return problem;
	}




	public void setProblem(String problem) {
		this.problem = problem;
	}




	public String getSolution() {
		return solution;
	}




	public void setSolution(String solution) {
		this.solution = solution;
	}




	public String getOperatorName() {
		return operatorName;
	}




	public void setOperatorName(String operatorName) {
		this.operatorName = operatorName;
	}




	public String getStartTime() {
		return startTime;
	}




	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}




	public String getSubmissionTime() {
		return submissionTime;
	}




	public void setSubmissionTime(String submissionTime) {
		this.submissionTime = submissionTime;
	}




	public String getEndTime() {
		return endTime;
	}




	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}




	public String getDate() {
		return date;
	}




	public void setDate(String date) {
		this.date = date;
	}




	public String getDept() {
		return dept;
	}




	public void setDept(String dept) {
		this.dept = dept;
	}




	
	
	
	

}
