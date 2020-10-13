package com.capgemini;

public class MyLinkedList {
	public INode head;
	public INode tail;
	
	public MyLinkedList() {
		this.head = null;
		this.tail = null;
	}
	public void add(INode newNode) {
		if(this.tail==null) {
			this.tail=newNode;
		}
		if(this.head==null) {
			this.head=newNode;
		}
		else {
			INode tempNode = this.head;
			this.head=newNode;
			this.head.setNext(tempNode);			
		}
	}
	
	public void append(INode node) {
		if(this.tail==null) {
			this.tail=node;
		}
		if(this.head==null) {
			this.head=node;
		}
		else {
			this.tail.setNext(node);
			this.tail=node;
		}
	}
	
	public void insert(INode myNode, INode newNode) {
		INode tempNode = myNode.getNext();
		myNode.setNext(newNode);
		newNode.setNext(tempNode);
	}
	
	public INode pop() {
		INode tempNode = this.head;
		this.head=head.getNext();
		return tempNode;
		
	}
	
	public INode popLast() {
		INode tempNode = head;
		while(!tempNode.getNext().equals(tail)) {
			tempNode = tempNode.getNext();
		}
		this.tail=tempNode;
		tempNode = tempNode.getNext();
		return tempNode;
	}
	
	public void printMyNodes() {
		StringBuffer myNodes = new StringBuffer("My Nodes: ");
		INode tempNode = head;
		while(tempNode.getNext()!= null) {
			myNodes.append(tempNode.getkey());
			if(!tempNode.equals(tail)) myNodes.append("->");
			tempNode = tempNode.getNext();	
		}
		myNodes.append(tempNode.getkey());
		System.out.println(myNodes);
	}
	
	
}
