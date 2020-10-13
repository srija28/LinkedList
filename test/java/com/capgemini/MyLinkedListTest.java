package com.capgemini;

import org.junit.Test;
import org.junit.Assert;

public class MyLinkedListTest {
	@Test
	public void given3NumbersWhenAddedToLinkedListShouldBeAddedToTop() {
		Node<Integer> myFirstNode = new Node<>(70);
		Node<Integer> mySecondNode = new Node<>(30);
		Node<Integer> myThirdNode = new Node<>(56);
		MyLinkedList linkedlist = new MyLinkedList();
		linkedlist.add(myFirstNode);
		linkedlist.add(mySecondNode);
		linkedlist.add(myThirdNode);
		linkedlist.printMyNodes();
		boolean result = linkedlist.head.equals(myThirdNode) && linkedlist.head.getNext().equals(mySecondNode)
				&& linkedlist.tail.equals(myFirstNode);
		Assert.assertEquals(true, result);
	}
}
