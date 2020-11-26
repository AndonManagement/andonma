package com.simple.model;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
//page 2
public class LineStation {
	
	@Id
	int lineNumber;
	ArrayList<Nodes> nodes = new ArrayList();
	
	

	public LineStation(int lineNumber, ArrayList<Nodes> nodes) {
		super();
		this.lineNumber = lineNumber;
		this.nodes = nodes;
	}
	
	public void clear()
	{
		this.nodes.clear();
	}
	public LineStation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getLineNumber() {
		return lineNumber;
	}

	public void setLineNumber(int lineNumber) {
		this.lineNumber = lineNumber;
	}

	public ArrayList<Nodes> getNodes() {
		return this.nodes;
	}

	public void setNodes(ArrayList<Nodes> Nodes) {
		this.nodes = Nodes;
	}
	
	

}
