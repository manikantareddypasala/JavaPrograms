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
		System.out.println(temp.data);
	}
	
	public void addAtBegining(Object data) {
		LinkedList temp = new LinkedList(data);
		temp.next = head;
		head = temp;
	}
	
	
	public void remove(Object data) {
		
		LinkedList prev = head;
		
		if (head != null) {
			if (head.data.equals(data)) {
				head = head.next;
			} else {
				LinkedList temp = head;
				while (temp.next != null) {
					
					if (temp.data.equals(data)) {
						prev.next = temp.next;
					}
					prev = temp;
					temp = temp.next;
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
	
	public void insertAtMidle(Object data) {
		
		int position = getMiddlePosition();
		
		if (position == -1) {
			System.out.println("empty list already ");
			head = new LinkedList(data);
		} else if(position == 1) {
			System.out.println("only one element is available");
			head.next= new LinkedList(data);
		} else {
			
			LinkedList temp = head;
			LinkedList prev = null;
			int pointer = 1;
			
			while(pointer != position ) {
				
				prev = temp;
				temp= temp.next;
				pointer ++;
				
			}
			prev.next = new LinkedList(data);
			prev.next.next = temp;
		}
		
	}
	
	public void deleteAtMidle() {
		
		int position = getMiddlePosition();
		
		if (position == -1) {
			System.out.println("empty list already ");
		} else if(position == 1) {
			System.out.println("only one element is available");
		} else {
			
			LinkedList temp = head;
			LinkedList prev = null;
			int pointer = 1;
			
			while(pointer != position ) {
				
				prev = temp;
				temp= temp.next;
				pointer ++;
				
			}
			prev.next = temp.next;
		}
	}	
	
	public int findLength() {
		
		LinkedList temp = head;
		int len = 0;
		
		while(temp != null) {
			
			len ++;
			temp= temp.next;
		}
		return len;
	}
	
	public int getMiddlePosition() {
		
		if (findLength() != 0)
			return (findLength()/2)+1;
		else
			return -1;
	}
}
