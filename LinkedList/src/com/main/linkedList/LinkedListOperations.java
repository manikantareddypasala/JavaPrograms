package com.main.linkedList;

public class LinkedListOperations {
	
	public static void main(String args[]) {
		
		LinkedList ll = new LinkedList();
		
		ll.add(12);
		ll.add(10);
		ll.add(15);
		ll.add(9);
		
		ll.traverseLinkedList();
		
		ll.addAtBegining(1);
		
		ll.traverseLinkedList();
		
		ll.removeAtBegining();
		
		ll.traverseLinkedList();
		
		ll.removeAtEnd();
		
		ll.traverseLinkedList();
		
		ll.remove(10);
		
		ll.traverseLinkedList();
		
		ll.add(31);
		ll.add(55);
		ll.add(91);
		
		System.out.println("length of linked list:"+ ll.findLength());
		ll.traverseLinkedList();
		
		ll.deleteAtMidle();
		
		ll.traverseLinkedList();
		
		ll.insertAtMidle(100);
		
		ll.traverseLinkedList();
		
	}

}
