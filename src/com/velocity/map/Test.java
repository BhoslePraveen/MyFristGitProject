package com.velocity.map;

import java.util.HashMap;

public class Test {

	// Can we use Employee class as a key in map?
	// map{k,v} K -> Obj V -> obj

	public static void main(String[] args) {

		Employee emp1 = new Employee(1000, "Vishal", "IT");
		Employee emp2 = new Employee(100, "Vishal", "IT");
		Employee emp3 = new Employee(15000, "Esha", "HR");

		HashMap<Employee, Integer> hashMap = new HashMap<>();
		hashMap.put(emp1, 101);
		hashMap.put(emp2, 102);
		hashMap.put(emp3, 103);
		
		System.out.println(hashMap);

	}

}
