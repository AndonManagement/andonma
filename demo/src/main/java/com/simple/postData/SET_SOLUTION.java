package com.simple.postData;

public class SET_SOLUTION {
	
	String solution;
	String selectedSubmissionTime;
	public SET_SOLUTION() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public SET_SOLUTION(String solution, String selectedSubmissionTime) {
		super();
		this.solution = solution;
		this.selectedSubmissionTime = selectedSubmissionTime;
	}
	
	public String getSolution() {
		return solution;
	}
	public void setSolution(String solution) {
		this.solution = solution;
	}
	public String getSelectedSubmissionTime() {
		return selectedSubmissionTime;
	}
	public void setSelectedSubmissionTime(String selectedSubmissionTime) {
		this.selectedSubmissionTime = selectedSubmissionTime;
	}

	@Override
	public String toString() {
		return "SET_SOLUTION [solution=" + solution + ", selectedSubmissionTime=" + selectedSubmissionTime + "]";
	}

	

}
