package com.velocity.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo2 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Pune");
		list.add("Mumbai");
		list.add("Nashik");
		
		Iterator<String> itr = list.iterator();//Ctrl+1+enter
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println(list.size());
		System.out.println(list.contains("Nashik"));

	}

}
