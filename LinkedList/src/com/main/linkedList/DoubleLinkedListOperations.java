package com.main.linkedList;

public class DoubleLinkedListOperations {
	
public static void main(String args[]) {
		
	DoubleLinkedList dl = new DoubleLinkedList();
		
		dl.add(12);
		dl.add(10);
		dl.add(15);
		dl.add(9);
		
		dl.traverseLinkedList();
		
		dl.addAtBegining(1);
		
		dl.traverseLinkedList();
		
		dl.removeAtBegining();
		
		dl.traverseLinkedList();
		
		dl.removeAtEnd();
		
		dl.traverseLinkedList();
		
		dl.remove(10);
		
		dl.traverseLinkedList();
		
		dl.add(31);
		dl.add(55);
		dl.add(91);
		
		System.out.println("length of linked list:"+ dl.findLength());
		dl.traverseLinkedList();
		
		dl.deleteAtMidle();
		
		dl.traverseLinkedList();
		
		dl.insertAtMidle(100);
		
		dl.traverseLinkedList();
		
	}

}
