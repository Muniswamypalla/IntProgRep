package com.arya.ds.programs;

public class LinkedListTest {

	public static void main(String[] args) {
		SinglyLinkedList<Integer> linkedList = new SinglyLinkedList<Integer>();
		linkedList.add(2);
		linkedList.add(4);
		linkedList.add(5);
		linkedList.add(9);
		//insert 7 in sorting order.
		linkedList.iterator();
		linkedList.addInSorted(1);
		linkedList.iterator();
	}
	
	
}
