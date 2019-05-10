package com.mahesh.model;

import org.springframework.beans.factory.annotation.Required;

public class Company {

	private String compname;
	private String compaddress;

	public Company() {
		// TODO Auto-generated constructor stub
	}

	public String getCompname() {
		return compname;
	}

	public String getCompaddress() {
		return compaddress;
	}

	public Company(String compname, String compaddress) {
		super();
		this.compname = compname;
		this.compaddress = compaddress;
	}

	@Override
	public String toString() {
		return "Company [compname=" + compname + ", compaddress=" + compaddress + "]";
	}

}
