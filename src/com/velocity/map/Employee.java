package com.velocity.map;

import java.util.Objects;

public class Employee {
	private int salary;
	private String name;
	private String department;

	public Employee() {

	}

	public Employee(int salary, String name, String department) {
		super();
		this.salary = salary;
		this.name = name;
		this.department = department;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [salary=" + salary + ", name=" + name + ", department=" + department + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(department, name, salary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(department, other.department) && Objects.equals(name, other.name)
				&& salary == other.salary;
	}

}
