package com.velocity.vector;

import java.util.Vector;

public class Demo1 {

	public static void main(String[] args) {
		
		

		Vector<Character> vector = new Vector<>();
		System.out.println(vector.capacity());

		for (int i = 1; i < 22; i++) {
			vector.add((char) i);
		}
		System.out.println(vector.capacity());
		System.out.println(vector);

	}
}
