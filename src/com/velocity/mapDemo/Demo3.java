package com.velocity.mapDemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Demo3 {

	public static void main(String[] args) {

		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "Pune");
		map.put(2, "Mumbai");
		map.put(3, "nashik");

//		Set<Integer> keySet = map.keySet();
//		for (Integer i : keySet) {
//			System.out.println("Key:" + i);
//			System.out.println("value:" + map.get(i));
//		}

		Set<Integer> key = map.keySet();
		Iterator<Integer> itr = key.iterator();
		while (itr.hasNext()) {
			Integer next = itr.next();
			System.out.println("keys: " + next);
			System.out.println("Value: " + map.get(next));
		}

		map.forEach((k, v) -> System.out.println("key:" + k + "value" + v));

	}

}
