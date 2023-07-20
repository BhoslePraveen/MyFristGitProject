package com.velocity.mapDemo;

import java.util.LinkedHashMap;

public class Demo2 {

	public static void main(String[] args) {
		LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
		System.out.println(map.put(20, 10000));
		System.out.println(map.put(30, 10000));
		System.out.println(map.put(20, 12000));
		System.out.println(map.put(20, 15000));
		System.out.println(map);
		
	}

}
