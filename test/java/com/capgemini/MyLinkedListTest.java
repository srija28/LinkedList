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
	
	@Test
	public void testforAppend() {
		System.out.println("This is test method for appending element to the list end.");
		Node<Integer> myFirstNode = new Node<>(56);
		Node<Integer> mySecondNode = new Node<>(30);
		Node<Integer> myThirdNode = new Node<>(70);
		MyLinkedList linkedlist = new MyLinkedList();
		linkedlist.add(myFirstNode);
		linkedlist.append(mySecondNode);
		linkedlist.append(myThirdNode);
		linkedlist.printMyNodes();
		boolean result = linkedlist.head.equals(myFirstNode) && linkedlist.head.getNext().equals(mySecondNode)
				&& linkedlist.tail.equals(myThirdNode);
		Assert.assertTrue(result);
	}
	@Test
	public void testforAddInTheMiddleOfTheList() {
		Node<Integer> myFirstNode = new Node<>(56);
		Node<Integer> mySecondNode = new Node<>(30);
		Node<Integer> myThirdNode = new Node<>(70);
		MyLinkedList linkedlist = new MyLinkedList();
		linkedlist.add(myFirstNode);
		linkedlist.append(myThirdNode);
		linkedlist.insert(myFirstNode, mySecondNode);
		linkedlist.printMyNodes();
		boolean result = linkedlist.head.equals(myFirstNode) && linkedlist.head.getNext().equals(mySecondNode)
				&& linkedlist.tail.equals(myThirdNode);
		Assert.assertEquals(true, result);
	}
	
	@Test
	public void testforPop() {
		Node<Integer> myFirstNode = new Node<>(70);
		Node<Integer> mySecondNode = new Node<>(30);
		Node<Integer> myThirdNode = new Node<>(56);
		MyLinkedList linkedlist = new MyLinkedList();
		linkedlist.add(myFirstNode);
		linkedlist.add(mySecondNode);
		linkedlist.add(myThirdNode);
		linkedlist.printMyNodes();
		linkedlist.pop();
		System.out.println("after using the pop method");
		linkedlist.printMyNodes();
		Node<Integer> pop = (Node<Integer>) linkedlist.pop();
		Assert.assertEquals(mySecondNode,pop);
	}
	@Test
	public void testforPopLastElement() {
		Node<Integer> myFirstNode = new Node<>(70);
		Node<Integer> mySecondNode = new Node<>(30);
		Node<Integer> myThirdNode = new Node<>(56);
		MyLinkedList linkedlist = new MyLinkedList();
		linkedlist.add(myFirstNode);
		linkedlist.add(mySecondNode);
		linkedlist.add(myThirdNode);
		linkedlist.printMyNodes();
		linkedlist.popLast();
		linkedlist.printMyNodes();
	}
	@Test
	public void testforSearch() {
		Node<Integer> myFirstNode = new Node<>(70);
		Node<Integer> mySecondNode = new Node<>(30);
		Node<Integer> myThirdNode = new Node<>(56);
		MyLinkedList linkedlist = new MyLinkedList();
		linkedlist.add(myFirstNode);
		linkedlist.add(mySecondNode);
		linkedlist.add(myThirdNode);
		Node<Integer> search = (Node<Integer>) linkedlist.search(30);
		Assert.assertEquals(mySecondNode, search);
		
	}
}
