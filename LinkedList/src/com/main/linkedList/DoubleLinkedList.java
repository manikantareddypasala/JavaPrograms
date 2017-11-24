package com.main.linkedList;

public class DoubleLinkedList {
	
	DoubleLinkedList head;
	DoubleLinkedList next;
	DoubleLinkedList prev;
	DoubleLinkedList tail;
	Object data;
	
	DoubleLinkedList() {
	}
	
	DoubleLinkedList(Object data){
		this.data = data;
	}
	
	public void add(Object data) {
		
		if (head == null) {
			head = new DoubleLinkedList(data);
			tail= head;
		} else {
			DoubleLinkedList temp = head;
			while (temp.next != null) {
				temp = temp.next;	
			}
			temp.next = new DoubleLinkedList(data);
			temp.next.prev = temp;
			tail=temp.next;
			tail.prev = temp;
		}
		
	}
	
	public void traverseLinkedList() {
		DoubleLinkedList temp = head;
		while(temp.next != null) {
			System.out.print(temp.data + ", ");
			temp = temp.next;
		}
		System.out.println(temp.data);
	}
	
	public void addAtBegining(Object data) {
		DoubleLinkedList temp = new DoubleLinkedList(data);
		temp.next = head;
		head = temp;
	}
	
	
	public void remove(Object data) {
		
		DoubleLinkedList prev = head;
		
		if (head != null) {
			if (head.data.equals(data)) {
				head = head.next;
			} else {
				DoubleLinkedList temp = head;
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
		DoubleLinkedList temp = head;
		head = temp.next;
	}

	public void removeAtEnd() {
		DoubleLinkedList temp = head;
		DoubleLinkedList prev = temp;
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
			head = new DoubleLinkedList(data);
		} else if(position == 1) {
			System.out.println("only one element is available");
			head.next= new DoubleLinkedList(data);
		} else {
			
			DoubleLinkedList temp = head;
			DoubleLinkedList prev = null;
			int pointer = 1;
			
			while(pointer != position ) {
				
				prev = temp;
				temp= temp.next;
				pointer ++;
				
			}
			prev.next = new DoubleLinkedList(data);
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
			
			DoubleLinkedList temp = head;
			DoubleLinkedList prev = null;
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
		
		DoubleLinkedList temp = head;
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
