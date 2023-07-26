package com.velocity.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Example {

	public static void main(String[] args) {
		// Create the MH cities
		ArrayList<String> mhList = new ArrayList<>();
		mhList.add("Pune");
		mhList.add("mumbai");
		mhList.add("Nashik");

		// Create KR cities

		ArrayList<String> krList = new ArrayList<>();
		krList.add("Bangalore");
		krList.add("Hubli");
		krList.add("Dharwad");

		// Create MP cities

		ArrayList<String> mpList = new ArrayList<>();
		mpList.add("Indore");
		mpList.add("Bhopal");
		mpList.add("Ujjain");

		// Create the states with cities
		HashMap<String, ArrayList<String>> hmStates = new HashMap<>();
		hmStates.put("MH", mhList);
		hmStates.put("KR", krList);
		hmStates.put("MP", mpList);

		// Create country with states and cities
		HashMap<String, HashMap<String, ArrayList<String>>> hmCountry = new HashMap<>();
		hmCountry.put("IND", hmStates);

		Set<String> key = hmCountry.keySet();
		Iterator<String> itr = key.iterator();
		while (itr.hasNext()) {
			String next = itr.next();
			System.out.println("Country :" + next);
			HashMap<String, ArrayList<String>> hashMapState = hmCountry.get(next);
			Set<String> statekeys = hashMapState.keySet();
			for (String state : statekeys) {
				System.out.println("State: " + state);
				System.out.println("Cities: " + hashMapState.get(state));
			}

		}

	}

}
