package com.velocity.map;

import java.util.HashMap;
import java.util.Set;

public class Demo {

	// we have to design a method which will return map of string
	// map{k,v} -> k=> String (ND) V => String (D)
	// Hashmap, LinkedHahmap, TreeMap
	// put
	public HashMap<String, String> getMap() {
		HashMap<String, String> stateMap = new HashMap<>();
		stateMap.put("Delhi", "1");
		stateMap.put("Karnataka", "2");
		stateMap.put("Bhopal", "3");
		stateMap.put("Manipur", "4");
		stateMap.put("Rajestan", "3");
		stateMap.put("XYZ", "3");
		return stateMap;
	}

	// We have to design a method which will give us matching value for given value
	// from
	// from a hash map

	// i/p : 1 ----> o/p : Vishal
	// 10 ----> Divya

	// HashMap <Integer ,String>

	public String getName(int rollno) {

		HashMap<Integer, String> studentsMap = new HashMap<>();
		studentsMap.put(1, "vishal");
		studentsMap.put(2, "harshda");
		studentsMap.put(3, "Isha");
		studentsMap.put(4, "Mayuri");

		//String name = studentsMap.getOrDefault(rollno, "No Student for this Id");
		String name = studentsMap.get(rollno);

		return name;

	}

	public static void main(String[] args) {

		Demo demo = new Demo();
		String name = demo.getName(10);
		System.out.println(name);
		
		

	}

}
