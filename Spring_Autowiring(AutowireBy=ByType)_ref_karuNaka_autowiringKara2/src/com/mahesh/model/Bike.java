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

	@Required
	public void setBikeName(String bikeName) {
		this.bikeName = bikeName;
	}

	public String getBikeavg() {
		return bikeavg;
	}
	@Required
	public void setBikeavg(String bikeavg) {
		this.bikeavg = bikeavg;
	}

	public String getManu() {
		return manu;
	}

	public void setManu(String manu) {
		this.manu = manu;
	}

	@Override
	public String toString() {
		return "Bike [bikeName=" + bikeName + ", bikeavg=" + bikeavg + ", manu=" + manu + "]";
	}

}
