package com.velocity.arraylist;

public class Employee {
	
	private int id;
	private String name;
	private String department;
	
	public Employee(int id, String name, String department) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", department=" + department + "]";
	}
	
	
	

}
