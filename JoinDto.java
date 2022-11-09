package com.info.ass.dto;

public class JoinDto {
	

	private Integer entitiId;
	private String name;
	private String case_number;
	private String company_name;

	public JoinDto(Integer entitiId, String name, String case_number, String company_name) {
		this.entitiId = entitiId;
		this.name = name;
		this.case_number = case_number;
		this.company_name = company_name;
	}


}
