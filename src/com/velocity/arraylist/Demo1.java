package com.velocity.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo1 {

	// Program to copy arraylist to another arraylist
	public static void main(String[] args) {

		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(10);
		list1.add(20);
		list1.add(30);

		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(40);
		list2.add(50);
		list2.add(60);

		list1.addAll(list2);

		System.out.println("Demo for arrayList");
		// System.out.println(list1);

//		for (int d : list1) {
//			System.out.println(d);
//		}

		// Using iterator

		Iterator<Integer> itr = list1.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
