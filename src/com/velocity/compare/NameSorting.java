package com.velocity.compare;

import java.util.Comparator;

import com.velocity.map.Employee;

public class NameSorting implements Comparator<Employee> {

	@Override
	public int compare(Employee emp1, Employee emp2) {
		// 0,1,-1

		return emp1.getName().compareTo(emp2.getName());
	}

}
