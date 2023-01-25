package com.example.demo.practice;

public class Employee {

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", Salary=" + Salary + ", dept=" + dept + ", active=" + active
				+ ", yearOfjoining=" + yearOfjoining + ", age=" + age + "]";
	}

	private Integer id;

	private String name;

	private double Salary;

	private String dept;

	private String active;

	int yearOfjoining;
	int age;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return Salary;
	}

	public void setSalary(double salary) {
		Salary = salary;
	}

	public String getDept() {
		return dept;
	}

	public Employee(Integer id, String name, double salary, String dept, String active, int yearOfjoining, int age) {
		super();
		this.id = id;
		this.name = name;
		Salary = salary;
		this.dept = dept;
		this.active = active;
		this.yearOfjoining = yearOfjoining;
		this.age = age;
	}

	public String getActive() {
		return active;
	}

	public void setActive(String active) {
		this.active = active;
	}

	public int getYearOfjoining() {
		return yearOfjoining;
	}

	public void setYearOfjoining(int yearOfjoining) {
		this.yearOfjoining = yearOfjoining;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}



}
