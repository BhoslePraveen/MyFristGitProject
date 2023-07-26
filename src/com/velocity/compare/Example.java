package com.velocity.compare;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import com.velocity.map.Employee;

public class Example {

	public static void main(String[] args) {

		int[] arr = { 11, 5, 1, 3, 8, 6 };
		Arrays.sort(arr);
		for (int i : arr) {
			System.out.println(i);
		}

		ArrayList<Employee> list = new ArrayList<>();
		list.add(new Employee(102, "Vijay", "IT"));
		list.add(new Employee(101, "Ajay", "ADMIN"));
		list.add(new Employee(103, "Sohan", "NETWORK"));
		list.add(new Employee(102, "Rohan", "NETWORK"));
		System.out.println("Hello All ");
        System.out.println("welcome all ");
		Collections.sort(list, new NameSorting());
		System.out.println(list);
		Collections.sort(list, new SalarySorting());
		System.out.println(list);
	}

}
