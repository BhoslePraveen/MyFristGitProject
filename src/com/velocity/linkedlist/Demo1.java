package com.velocity.linkedlist;

import java.util.LinkedList;
import java.util.ListIterator;

public class Demo1 {

	// Design a method which will print a Linked list of Numbers
	public static void getLinkedList() {
		LinkedList<Integer> numberList = new LinkedList<Integer>();
		numberList.add(12);
		numberList.add(15);
		numberList.addFirst(11);
		numberList.add(20);
		numberList.removeLast();
		numberList.addFirst(25);

		ListIterator<Integer> itr = numberList.listIterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

	public static void main(String[] args) {
		getLinkedList();

	}

}
