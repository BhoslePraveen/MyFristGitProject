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
		numberList.addLast(18);
		numberList.removeLast();

		ListIterator<Integer> itr = numberList.listIterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

	public static void main(String[] args) {
		getLinkedList();

	}

}
