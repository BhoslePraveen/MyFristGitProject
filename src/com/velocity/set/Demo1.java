package com.velocity.set;

import java.util.HashSet;

public class Demo1 {

	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(10);
		set.add(20);
		set.add(10);
		set.add(10);
		set.add(null);
		set.add(null);
		System.out.println(set);
				

	}

}
