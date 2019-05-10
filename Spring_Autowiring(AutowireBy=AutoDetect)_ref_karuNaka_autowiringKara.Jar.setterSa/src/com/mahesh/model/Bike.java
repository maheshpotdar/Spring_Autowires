package com.mahesh.model;

import org.springframework.beans.factory.annotation.Required;

public class Bike {

	private String bikeName;
	private String bikeavg;
	private String manu;

	public Bike() {
		// TODO Auto-generated constructor stub
	}

	public String getBikeName() {
		return bikeName;
	}

	public void setBikeName(String bikeName) {
		this.bikeName = bikeName;
	}

	public void setBikeavg(String bikeavg) {
		this.bikeavg = bikeavg;
	}

	public void setManu(String manu) {
		this.manu = manu;
	}

	public String getBikeavg() {
		return bikeavg;
	}

	public String getManu() {
		return manu;
	}

	public Bike(String bikeName, String bikeavg, String manu) {
		super();
		this.bikeName = bikeName;
		this.bikeavg = bikeavg;
		this.manu = manu;
	}

	@Override
	public String toString() {
		return "Bike [bikeName=" + bikeName + ", bikeavg=" + bikeavg + ", manu=" + manu + "]";
	}

}
