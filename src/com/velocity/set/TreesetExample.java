package com.velocity.set;

import java.util.TreeSet;

public class TreesetExample {

	public static void main(String[] args) {

		TreeSet<String> set = new TreeSet<String>();
		set.add("Raju");
		set.add("Arjun");
		set.add("Charan");
		set.add("Bheem");
		System.out.println(set);
		
		TreeSet<Integer> set1 =  new TreeSet<>();
		set1.add(55);
		set1.add(65);
		set1.add(25);
		set1.add(null);
		
		System.out.println(set1.descendingSet());
	}

}
