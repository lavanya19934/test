package com.info.ass.repo;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.info.ass.dto.*;
import com.info.ass.model.Company;
public interface JoinRepository extends JpaRepository<Company, Integer> {

	@Query("SELECT new com.roytuts.spring.data.jpa.left.right.inner.cross.join.dto.JoinDto(s.id, c.name, c.name, e.case_number) "
			+ "FROM Sale s LEFT JOIN s.food f LEFT JOIN f.company c")
	List<JoinDto> getAllEntities();

	@Query("SELECT new com.roytuts.spring.data.jpa.left.right.inner.cross.join.dto.JoinDto(s.id, c.name, c.name, e.case_number) "
			+ "FROM Sale s RIGHT JOIN s.food f RIGHT JOIN f.company c")
	List<JoinDto> updateEnties_cases();

	@Query("SELECT new com.roytuts.spring.data.jpa.left.right.inner.cross.join.dto.JoinDto(s.id, c.name, c.name, e.case_number) "
			+ "FROM Sale s INNER JOIN s.food f INNER JOIN c.company c")
	List<JoinDto> fetchDataInnerJoin();

	@Query("SELECT new com.roytuts.spring.data.jpa.left.right.inner.cross.join.dto.JoinDto(s.id, c.name, c.name, e.case_number) "
			+ "FROM Sale s, Food f, Company c WHERE s.food.id = c.id AND c.company.id = c.id")
	List<JoinDto> getCaseNumberId();

}