package com.info.ass.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
@Table(name = "etititesToCases")
public class EtititesToCases {

	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name = "case_number")
	private String case_number;

	@Column(name = "craetedAt")
	private Date craetedAt;


	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "cases_id", insertable = false, updatable = false)
	@Fetch(FetchMode.JOIN)
	private Cases cases;
}


