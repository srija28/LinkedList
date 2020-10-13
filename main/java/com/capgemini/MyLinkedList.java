package com.capgemini;

import java.util.Comparator;

public class MyLinkedList<K extends Comparable<K>> {
	public INode head;
	public INode tail;
	public int size=0;
	
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
	
	public <K> INode search(K key){
		INode tempNode = head;
		while(!tempNode.equals(tail)) {
			if(tempNode.getkey()==key) {
				System.out.println("Element is present");
				return tempNode;
			}
			tempNode = tempNode.getNext();
		}
		if(tempNode.getkey()==key) {
			System.out.println("Element is present ");
			return tempNode;
		}
		else {
			System.out.println("Element is not present");
			return null;
		}
	}
	public INode searchAndInsert(K key, INode Node) {
		INode temp = head;
		while (temp != null && temp.getNext() != null) {
			if (temp.getkey()==key) {
				break;
			} else
				temp = temp.getNext();
		}
		INode temp2 = temp.getNext();
		temp.setNext(Node);
		Node.setNext(temp2);
		return temp;
	}
	
	public INode searchAndRemove(K key) {
		INode temp = head;
		while (temp != null && temp.getNext() != null) {
			if (temp.getNext().getkey().equals(key)) {
				break;
			} else
				temp = temp.getNext();
		}
		temp.setNext(temp.getNext().getNext());
		size--;
		return temp;
	}

	public int Resize() {
		return size;
	}
	
	public void addAndSort(INode<K> newNode) {
		INode<K> node1 = head;
		INode<K> node2 = null;
		while(node1 != null && newNode.getkey().compareTo(node1.getkey()) > 0) {
			node2 = node1;
			node1 = node1.getNext();
		}
		if(node2 == null) {
			this.head = newNode;
		}else {
			node2.setNext(newNode);
		}
		newNode.setNext(node1);
		while(node1 != null) {
			this.tail = node1;
			node1 = node1.getNext();
		}
		
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
