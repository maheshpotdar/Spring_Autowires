package com.mahesh.model;

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

	public void setCarname(String carname) {
		this.carname = carname;
	}

	public void setCarmodel(String carmodel) {
		this.carmodel = carmodel;
	}

	public String getCarmodel() {
		return carmodel;
	}

	@Override
	public String toString() {
		return "Car [carname=" + carname + ", carmodel=" + carmodel + "]";
	}

	public Car(String carname, String carmodel) {
		super();
		this.carname = carname;
		this.carmodel = carmodel;
	}

}
