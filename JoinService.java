package com.info.ass.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.roytuts.spring.data.jpa.left.right.inner.cross.join.dto.JoinDto;
import com.roytuts.spring.data.jpa.left.right.inner.cross.join.repository.JoinRepository;

@Service
public class JoinService {

	@Autowired
	private JoinRepository joinRepository;

	public List<JoinDto> getAllEntities(@RequestBody(Company company)) {
		return joinRepository.fetchDataLeftJoin();
	}

	public List<JoinDto> updateEnties_cases() {
		return joinRepository.updateEnties_cases();
	}

	public List<JoinDto> getCaseNumberId(Integer entitiId) {
		return joinRepository.getCaseNumberId();
	}

}
