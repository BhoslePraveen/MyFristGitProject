package com.velocity.compare;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo1 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		Integer[] arr = { 1, 8, 9, 5, 6 };
		list = Arrays.asList(arr);
		list.add(10);
		System.out.println(list);

	}

}
