package com.simple.controller;

import java.util.ArrayList;
import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.simple.Repository.LineStationRepo;
import com.simple.Repository.TeamMemberRepo;
import com.simple.Repository.TeamRepo;
import com.simple.getData.MemberStatus;
import com.simple.getData.Members;
import com.simple.getData.ProblemStatement;
import com.simple.getData.Role;
import com.simple.model.LineStation;
import com.simple.model.Problem;
import com.simple.model.Team;
import com.simple.model.TeamMember;


@RestController
public class GetApi {
	
	@Autowired
	LineStationRepo line;
	
	@Autowired
	TeamRepo teamRepo;
	
	@Autowired	
	TeamMemberRepo teamMemberRepo;
	
	
	@GetMapping(value = "/linestation", produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<ArrayList<LineStation>> GetLine()
	{
		ArrayList<LineStation> it = (ArrayList<LineStation>) line.findAll();
		
		if(it==null)
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);

			return new ResponseEntity<>(it , HttpStatus.OK);
	}
	
	@GetMapping(value = "/prostatement", produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<ArrayList<ProblemStatement>> GetProblemStatement()
	{
		ArrayList<Team> team = (ArrayList<Team>) teamRepo.findAll();
		ArrayList<ProblemStatement> pr = new ArrayList();
		
		
		if(team==null)
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		
		for(Team t : team)
		{
			ProblemStatement p = new ProblemStatement(t.getName(), t.getProblemStatement());
			pr.add(p);
		}

			return new ResponseEntity<>(pr , HttpStatus.OK);
	}
	
	@GetMapping(value = "/teamstatus", produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<ArrayList<MemberStatus>> GetTeamStatus()
	{
		ArrayList<Team> obj = (ArrayList<Team>) teamRepo.findAll();
		
		if(obj==null)
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		
		ArrayList<MemberStatus> send = new ArrayList();
		Iterator<Team> it = obj.iterator();
		while(it.hasNext())
		{
			Team team = it.next();
			MemberStatus men = new MemberStatus();
			men.setAvailableCount(team.getAvailableCount());
			men.setTeamName(team.getName());
			men.setTotalCount(team.getTotalCount());
			men.setWorkingCount(team.getWorkingCount());
			send.add(men);
		}

			return new ResponseEntity<>(send , HttpStatus.OK);
	}
	
	@GetMapping(value = "/members/{teamName}", produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<ArrayList<Members>> GetMembers(@PathVariable String teamName)
	{
		ArrayList<TeamMember> memberList = teamMemberRepo.findByTeamName(teamName);
		
		if(memberList==null)
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		
		ArrayList<Members> send = new ArrayList();
		Iterator<TeamMember> it = memberList.iterator();
		int count =0;
		while(it.hasNext())
		{
			TeamMember newteamMember = it.next();
			count++;
			Members member = new Members(count,newteamMember.getName());
			send.add(member);
		}

			return new ResponseEntity<>(send , HttpStatus.OK);
	}
	

}
