package com.simple.model;

import java.io.Serializable;

public class Nodes implements Serializable {
	
	int stationNumber;
	String color;
	
	
	
	
	public Nodes(int stationNumber, String color) {
		super();
		this.stationNumber = stationNumber;
		this.color = color;
	}
	public Nodes() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getStationNumber() {
		return stationNumber;
	}
	public void setStationNumber(int stationNumber) {
		this.stationNumber = stationNumber;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

}
