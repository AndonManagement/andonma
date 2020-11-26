package com.simple.controller;

import java.util.ArrayList;
import java.util.Optional;

import javax.print.attribute.standard.Media;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.simple.Repository.LineStationRepo;
import com.simple.Repository.TeamMemberRepo;
import com.simple.Repository.TeamRepo;
import com.simple.model.*;


import javassist.bytecode.Descriptor.Iterator;

@RestController
public class HomeController {
	
	@Autowired
	LineStationRepo line;
	
	@Autowired
	TeamRepo teamRepo;
	
	@Autowired
	TeamMemberRepo teamMeberRepo;
	
	@RequestMapping("/")
	   public String helloWorld() {
	      return "Hello World!";
	   }
	
	
	@RequestMapping("/put")
	public String putData()
	{
		ArrayList<Nodes> sc1 = new ArrayList();
		ArrayList<Nodes> sc2 = new ArrayList();
		ArrayList<Nodes> sc3 = new ArrayList();
		Nodes sta = new Nodes(1,"green");
		Nodes sta1 = new Nodes(2,"green");
		Nodes sta6 = new Nodes(3,"green");
		Nodes sta7 = new Nodes(4,"green");
		Nodes sta2 = new Nodes(1,"green");
		Nodes sta3 = new Nodes(2,"green");
		Nodes sta4 = new Nodes(1,"green");
		Nodes sta5 = new Nodes(2,"green");
		sc1.add(sta6);
		sc1.add(sta7);
		sc2.add(sta6);
		sc2.add(sta7);
		sc3.add(sta6);
		sc3.add(sta7);
		sc1.add(sta);
		sc1.add(sta1);
		sc2.add(sta2);
		sc2.add(sta3);
		sc3.add(sta4);
		sc3.add(sta5);
		LineStation  obj1 = new LineStation(1,sc1);
		LineStation  obj2 = new LineStation(2,sc2);
		LineStation  obj3 = new LineStation(3,sc3);
		
		line.save(obj1);
		line.save(obj2);
		line.save(obj3);
		
		return "Data put";
	}
	
	
	@RequestMapping("/team")
	public String PutData()
	{
		ArrayList<String> st = new ArrayList();
		st.add("problem 1");
		st.add("problem 2");
		st.add("problem 3");
		Team obj1 = new Team(1,"Supply",0,5,5,st);
		Team obj2 = new Team(2,"Quality",0,5,5,st);
		Team obj3 = new Team(3,"Testing",0,5,5,st);
		teamRepo.save(obj1);
		teamRepo.save(obj2);
		teamRepo.save(obj3);
		TeamMember obj4 = new TeamMember(1,"Jayesh","iij@gmail.com","supply");
		TeamMember obj5 = new TeamMember(2,"Nikhil","iij@gmail.com","Quality");
		TeamMember obj6 = new TeamMember(3,"Ayush","iij@gmail.com","Testing");
		teamMeberRepo.save(obj4);
		teamMeberRepo.save(obj5);
		teamMeberRepo.save(obj6);
		return "Data Submitaed";
	}
	

}
