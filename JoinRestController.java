package com.info.ass.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.roytuts.spring.data.jpa.left.right.inner.cross.join.dto.JoinDto;
import com.roytuts.spring.data.jpa.left.right.inner.cross.join.service.JoinService;

@RestController
public class JoinRestController {

	@Autowired
	private com.info.ass.service.JoinService joinService;

	@PostMapping("/entities")
	public ResponseEntity<List<JoinDto>> getAllEntities() {
		return new ResponseEntity<List<JoinDto>>(joinService.getAllEntities(), HttpStatus.OK);
	}

	@PostMapping("/updateEntiescases")
	public ResponseEntity<List<JoinDto>> updateEnties_cases() {
		return new ResponseEntity<List<JoinDto>>(joinService.updateEnties_cases(), HttpStatus.OK);
	}

	@GetMapping("casenumber")
	public ResponseEntity<List<JoinDto>> getCaseNumberId() {
		return new ResponseEntity<List<JoinDto>>(joinService.getCaseNumberId(), HttpStatus.OK);


}
