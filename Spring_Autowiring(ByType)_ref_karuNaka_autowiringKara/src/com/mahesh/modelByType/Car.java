package com.mahesh.modelByType;

import org.springframework.beans.factory.annotation.Required;

public class Car {

	private String carname;
	private String carmodel;

	public Car() {
		// TODO Auto-generated constructor stub
	}

	public String getCarname() {
		return carname;
	}
	
	@Required
	public void setCarname(String carname) {
		this.carname = carname;
	}

	public String getCarmodel() {
		return carmodel;
	}
	
	@Required
	public void setCarmodel(String carmodel) {
		this.carmodel = carmodel;
	}

	@Override
	public String toString() {
		return "Car [carname=" + carname + ", carmodel=" + carmodel + "]";
	}

}
