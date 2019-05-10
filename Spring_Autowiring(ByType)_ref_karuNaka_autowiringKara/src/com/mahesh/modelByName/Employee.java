package com.mahesh.modelByName;

public class Employee {

	private String empname;
	private String empaddress;

	private Car car;
	private Company company;
	private Bike bike;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public String getEmpaddress() {
		return empaddress;
	}

	public void setEmpaddress(String empaddress) {
		this.empaddress = empaddress;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public Bike getBike() {
		return bike;
	}

	public void setBike(Bike bike) {
		this.bike = bike;
	}

	@Override
	public String toString() {
		return "Employee [empname=" + empname + ", empaddress=" + empaddress + ", car=" + car + ", company=" + company
				+ ", bike=" + bike + "]";
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
