package com.info.ass.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "company")
public class Company {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "entitiId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "name")
	private String name;
	

	@Column(name = "address")
	private String address;
	

	@Column(name = "email")
	private String email;

	@Column(name = "company_name")
	private String company_name;
	
	@Column(name = "is_companhy")
	private boolean is_companhy;
	
	@Column(name = "created")
	private Date created;
	
	@OneToMany(targetEntity = Cases.class, mappedBy = "SERIAL", orphanRemoval = false, fetch = FetchType.LAZY)
	private Set<Cases> cases;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCompany_name() {
		return company_name;
	}

	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}

	public boolean isIs_companhy() {
		return is_companhy;
	}

	public void setIs_companhy(boolean is_companhy) {
		this.is_companhy = is_companhy;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public Set<Cases> getCases() {
		return cases;
	}

	public void setCases(Set<Cases> cases) {
		this.cases = cases;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Company [id=" + id + ", name=" + name + ", address=" + address + ", email=" + email + ", company_name="
				+ company_name + ", is_companhy=" + is_companhy + ", created=" + created + "]";
	}
	
	
	
	
}
