package com.neuedu.jdbc;

public class Account {

	private int id;
	private String name;
	private int salary;
	public Account()
	{
		 
	}
	public Account(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	 
	
	
}
