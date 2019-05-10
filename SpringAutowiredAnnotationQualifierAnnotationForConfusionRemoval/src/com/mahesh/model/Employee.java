package com.mahesh.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {

	@Autowired
	@Qualifier("c3")
	private Car car;

	private String empName;
	private String empAddress;
	private String empCompanyName;
	private String mobileNo;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Car getCar() {
		return car;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpAddress() {
		return empAddress;
	}

	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}

	public String getEmpCompanyName() {
		return empCompanyName;
	}

	public void setEmpCompanyName(String empCompanyName) {
		this.empCompanyName = empCompanyName;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public void showData() {

		System.out.println("EmpName: " + empName);
		System.out.println("EmpAddress: " + empAddress);
		System.out.println("EmpCompName: " + empCompanyName);

		System.out.println("Car: " + car.getCarname());
	}
}
