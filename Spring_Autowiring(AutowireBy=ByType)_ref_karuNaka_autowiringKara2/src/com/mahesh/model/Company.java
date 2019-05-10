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

	@Required
	public void setCompname(String compname) {
		this.compname = compname;
	}

	public String getCompaddress() {
		return compaddress;
	}

	@Required
	public void setCompaddress(String compaddress) {
		this.compaddress = compaddress;
	}

	@Override
	public String toString() {
		return "Company [compname=" + compname + ", compaddress=" + compaddress + "]";
	}

}
