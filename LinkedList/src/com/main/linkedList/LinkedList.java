package com.main.linkedList;

public class LinkedList {
	
	LinkedList head;
	LinkedList next;
	Object data;
	
	LinkedList() {
	}
	
	LinkedList(Object data){
		this.data = data;
	}
	
	public void add(Object data) {
		
		if (head == null) {
			head = new LinkedList(data);
		} else {
			LinkedList temp = head;
			while (temp.next != null) {
				temp = temp.next;	
			}
			temp.next = new LinkedList(data);
		}
		
	}
	
	public void traverseLinkedList() {
		LinkedList temp = head;
		while(temp.next != null) {
			System.out.print(temp.data + ", ");
			temp = temp.next;
		}
		System.out.print(temp.data);
	}
	
	public void addAtBegining(Object data) {
		LinkedList temp = new LinkedList(data);
		temp.next = head;
		head = temp;
	}
	
	
	public void remove(Object data) {
		
		if (head != null) {
			if (head.data.equals(data)) {
				head = head.next;
			} else {
				LinkedList temp = head;
				while (temp.next != null) {
					
					if (temp.data.equals(data)) {
						
					}
					
				}
			}
			
		}
	}
	
	public void removeAtBegining() {
		LinkedList temp = head;
		head = temp.next;
	}

	public void removeAtEnd() {
		LinkedList temp = head;
		LinkedList prev = temp;
		while(temp.next != null) {
			prev = temp;
			temp = temp.next;
		}
		prev.next = null;
	}
	

}
