package com.simple.controller;

import java.security.Principal;
import java.util.ArrayList;
import java.util.Collection;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClient;
import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;

import com.simple.getData.Role;


@RestController
public class LoginController  {
	
	@RequestMapping(value = "/role", produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<Role> GetRole(Authentication authentication)
	{
		
		 String string = authentication.getAuthorities().toString();
	

		 Role role = new Role(string);
		
		return new ResponseEntity<>(role , HttpStatus.OK);
	}
	

}
