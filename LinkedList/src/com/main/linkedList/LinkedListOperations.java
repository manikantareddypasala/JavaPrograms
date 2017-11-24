package com.main.linkedList;

public class LinkedListOperations {
	
	public static void main(String args[]) {
		
		LinkedList ll = new LinkedList();
		
		ll.add(12);
		ll.add(10);
		ll.add(15);
		ll.add(9);
		
		ll.traverseLinkedList();
		
		System.out.println();
		
		ll.addAtBegining(1);
		
		ll.traverseLinkedList();
		
		ll.removeAtBegining();
		
		System.out.println();
		ll.traverseLinkedList();
		ll.removeAtEnd();
		
		System.out.println();
		ll.traverseLinkedList();
		
		ll.remove(10);
		
		System.out.println();
	}

}
