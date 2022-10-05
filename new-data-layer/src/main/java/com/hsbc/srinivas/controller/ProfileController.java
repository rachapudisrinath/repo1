package com.hsbc.srinivas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hsbc.srinivas.model.Profile;
import com.hsbc.srinivas.service.ProfileServiceImpl;

@RestController
@RequestMapping("/api")
public class ProfileController {
	@Autowired
	private ProfileServiceImpl profileServiceImpl;
	
	@GetMapping("/profiles")
	public ResponseEntity<List<Profile>> getProfiles() {
				
		return ResponseEntity.ok().body(profileServiceImpl.getProfiles());
	}

}
