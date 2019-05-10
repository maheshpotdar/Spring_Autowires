package com.mahesh.model;

public class Employee {

	private String empname;
	private String empaddress;
	// IoC Container check karanar ByName manaje variable che nav car,company,bike
	// ahe kay asel tar inject kar.
	private Car car;
	private Company company;
	private Bike bike;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String empname, String empaddress, Car car, Company company, Bike bike) {
		super();
		this.empname = empname;
		this.empaddress = empaddress;
		this.car = car;
		this.company = company;
		this.bike = bike;
	}

	public void displayData() {

		System.out.println("Emp Name: " + empname);
		System.out.println("Emp Address: " + empaddress);

		System.out.println("Car Name: " + car.getCarname());
		System.out.println("Car ModelYear: " + car.getCarmodel());

		System.out.println("Bike Name: " + bike.getBikeName());
		System.out.println("Bike Avg: " + bike.getBikeavg());
		System.out.println("Bike Manufacturer: " + bike.getManu());

		System.out.println("Company Name: " + company.getCompname());
		System.out.println("Company Address: " + company.getCompaddress());
	}

}
