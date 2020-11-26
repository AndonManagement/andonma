package com.simple.controller;

import java.util.ArrayList;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.simple.Repository.LineStationRepo;
import com.simple.Repository.ProblemRepo;
import com.simple.model.LineStation;
import com.simple.model.Nodes;
import com.simple.model.Problem;
import com.simple.postData.SET_MEMBER;
import com.simple.postData.SET_SOLUTION;
import com.simple.postData.SET_USER;

import javassist.bytecode.Descriptor.Iterator;


@RestController
public class PostApi {
	
	Problem obj = new Problem();
	
	private static final Logger logger = LoggerFactory.getLogger(PostApi.class);
	
	@Autowired
	ProblemRepo problemRepo;
	
	@Autowired
	LineStationRepo lineRepo;
	
	@PostMapping(value = "/setUser")
	public ResponseEntity<SET_USER> PostUser(@RequestBody SET_USER user)
	{
		logger.info("PostUser");
		if(user==null)
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		
		obj.setDate(user.getSelectedDate());
		obj.setLineNumber(user.getLineNumber());
		obj.setStationNumber(user.getStationNumber());
		obj.setVariant(user.getSelectedVariant());
		obj.setSerialNumber(user.getSerialNumber());
		obj.setDept(user.getDept());
		obj.setProblem(user.getProblem());	
		
		LineStation lineStation = lineRepo.findByLineNumber(obj.getLineNumber());
		ArrayList<Nodes> stationColor = lineStation.getNodes();
		ArrayList<Nodes> newStationColor = new ArrayList<Nodes>();
		
		
		for(Nodes node : stationColor)
		{
			if(node.getStationNumber()==obj.getStationNumber())
			{
				node.setColor("red");
			}
			
				newStationColor.add(node);
		}
		
		lineStation.clear();
		logger.info("obj created and lineStation retrived and clear");
		
		System.out.println(newStationColor.size());
		
		lineRepo.deleteById(obj.getLineNumber());
		lineStation.setNodes(newStationColor);
		lineRepo.save(lineStation);
		
		
		return new ResponseEntity<>(user, HttpStatus.CREATED);
	}
	
	@PostMapping(value = "/setmember")
	public ResponseEntity<SET_MEMBER> PostMember(@RequestBody SET_MEMBER member)
	{
		logger.info("PostMember");
		if(member==null)
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		
		obj.setOperatorName(member.getSelectedMember());
		obj.setStartTime(member.getSelectedStartTime());
		obj.setEndTime(member.getSelectedEndTime());
		
		LineStation lineStation = lineRepo.findByLineNumber(obj.getLineNumber());
		ArrayList<Nodes> stationColor = lineStation.getNodes();
		ArrayList<Nodes> newStationColor = new ArrayList<Nodes>();
		
		for(Nodes node : stationColor)
		{
			if(node.getStationNumber()==obj.getStationNumber())
			{
				node.setColor("orange");
			}
			
				newStationColor.add(node);
		}
		
		lineStation.clear();
		logger.info("obj created and lineStation retrived and clear");
		System.out.println(newStationColor.size());
		
		lineRepo.deleteById(obj.getLineNumber());
		lineStation.setNodes(newStationColor);
		lineRepo.save(lineStation);
		
		return new ResponseEntity<>(member, HttpStatus.CREATED);
	}
	
	@PostMapping(value = "/setsolution")
	public ResponseEntity<SET_SOLUTION> PostSolution(@RequestBody SET_SOLUTION solution)
	{
		logger.info("Postsolution"+solution.toString());
		if(solution==null)
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		
		obj.setSubmissionTime(solution.getSelectedSubmissionTime());
		obj.setSolution(solution.getSolution());
		
		problemRepo.save(obj);
		
		LineStation lineStation = lineRepo.findByLineNumber(obj.getLineNumber());
		ArrayList<Nodes> stationColor = lineStation.getNodes();
		ArrayList<Nodes> newStationColor = new ArrayList<Nodes>();
		
		for(Nodes node : stationColor)
		{
			if(node.getStationNumber()==obj.getStationNumber())
			{
				node.setColor("green");
			}
			
				newStationColor.add(node);
		}
		
		lineStation.clear();
		logger.info("obj created and lineStation riterved and clear");
		System.out.println(newStationColor.size());
		
		lineRepo.deleteById(obj.getLineNumber());
		lineStation.setNodes(newStationColor);
		lineRepo.save(lineStation);
		
		return new ResponseEntity<>(solution, HttpStatus.CREATED);
	}
	
	

}
