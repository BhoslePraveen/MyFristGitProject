package com.velocity.compare;

import java.util.Comparator;

import com.velocity.map.Employee;

public class SalarySorting implements Comparator<Employee> {

	@Override
	public int compare(Employee emp1, Employee emp2) {

		if (emp1.getSalary() == emp2.getSalary()) {
			return 0;
		} else if (emp1.getSalary() > emp2.getSalary()) {
			return 1;
		} else {
			return -1;
		}
	}

}
