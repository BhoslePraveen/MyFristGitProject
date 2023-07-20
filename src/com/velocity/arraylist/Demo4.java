package com.velocity.arraylist;

import java.util.ArrayList;

public class Demo4 {

	public static void main(String[] args) {

		ArrayList<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee(10, "Mohan", "IT"));
		empList.add(new Employee(20, "Varun", "ADMIN"));
		empList.add(new Employee(30, "Vijay", "SERVER"));

		for (Employee emp : empList) {
			System.out.println(emp);
		}

	}

}
