package com.velocity.arraylist;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class Demo5 {

	public ArrayList<Integer> getArrayList() {

		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(30);
		list.add(30);
		list.add(30);
		list.add(70);
		list.add(30);
		list.add(10);
		list.add(30);
		list.add(30); // 11th
		list.add(1000);
		list.add(30);
		list.add(30);
		list.add(60);
		list.add(30);
		list.add(80);
		return list;
	}

	public static void main(String[] args) {

		Demo5 d = new Demo5();
		ArrayList<Integer> arrayList = d.getArrayList();
		LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>(arrayList);
		System.out.println(linkedHashSet);

	}

}
