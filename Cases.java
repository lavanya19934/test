package com.info.ass.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

public class Cases {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name = "case_number")
	private String case_number;

	@Column(name = "createdAt")
	private Date createdAt;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "company_id", insertable = false, updatable = false)
	@Fetch(FetchMode.JOIN)
	private Company company;

	@OneToMany(targetEntity = Sale.class, mappedBy = "id", orphanRemoval = false, fetch = FetchType.LAZY)
	private Set<Sale> sales;

}
