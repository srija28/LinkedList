package com.capgemini;

public interface INode<K> {
	K getkey();	
	
	INode getNext();
	void setNext(INode next);
	void setKey(K key);




}
