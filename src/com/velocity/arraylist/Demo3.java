package com.velocity.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Demo3 {

	public static void main(String[] args) {
		ArrayList<String> listOfCity = new ArrayList<String>();
		listOfCity.add("Pune");
		listOfCity.add("Mumbai");
		listOfCity.add("Nashik");
		listOfCity.add("Osmanabad");
		listOfCity.add("Nagpur");
		listOfCity.add("Sangali");
		listOfCity.add("Ratnagiri");
		listOfCity.add("Bidar");
		listOfCity.add("Hyderabad");
		listOfCity.add("Goa");
		listOfCity.add("Aurangabad");
		listOfCity.add("Dhule");
		listOfCity.add("Latur");
		listOfCity.add("Yevla");
		listOfCity.add("Chandrapur");
		listOfCity.add("Kolapur");
		listOfCity.add("Fursungi");
		listOfCity.add("Igatpuri");
		listOfCity.add("jalgao");
		listOfCity.add("Tuljapur");
		listOfCity.add("Washi");
		listOfCity.add("Udgir");
		listOfCity.add("Virar");
		
		System.out.println(listOfCity);
		
		Collections.sort(listOfCity);
		
		System.out.println(listOfCity);
	}

}
