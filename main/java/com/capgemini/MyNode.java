package com.capgemini;

public class MyNode<K> {
	public K key;
	public MyNode next;
	
	public MyNode(K key) {
		this.key= key;
		this.next=null;
	}


	public MyNode getNext() {
		return next;
	}

	public void setNext(MyNode next) {
		this.next = next;
	}
	

}
