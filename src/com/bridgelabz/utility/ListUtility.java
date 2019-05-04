package com.bridgelabz.utility;

public class ListUtility<T> {

	public class Node {
		Object data;
		Node next;
	}

	public Node head = null;

	// insert element
	public void add(T item) {

		Node newNode = new Node();

		newNode.data = item;
		newNode.next = head;
		head = newNode;

	}

	// display
	public void display() {
		Node node = head;
		while (node != null) {
			System.out.println(node.data);
			node = node.next;
		}

	}

	// is empty
	public void isEmpty() {
		Node node = head;
		if (node == null) {

			System.out.println("linkedlist is empty");
		} else {
			System.out.println("linkedlist is not empty ");
		}
	}

	// size

	public int size() {
		int count = 0;
		Node current = head;
		while (current != null) {
			current = current.next;
			count++;
		}

		return count;

	}

	// search
	public boolean search(Node head, T item) {

		Node node = head;
		while (node != null) {
			if (node.data.equals(item)) {
				return true;
			} else {
				node = node.next;
			}

		}
		return false;
	}

	// pop
	public void pop(T item) {

		Node temp = head;
		Node temp1 = head;

		if (temp.data.equals(item)) {
			head = head.next;
		}
		while (temp != null) {
			if (temp.data.equals(item)) {
				temp1.next = temp.next;
			}
			temp1 = temp;
			temp = temp.next;
		}
	}

	/*
	 * // index public void index(Node head, int index) { int count = 1; Node
	 * current = head; while (current != null) { if (count == index)
	 * System.out.println("Data found at index " + index + current.data); } current
	 * = current.next; count++;
	 * 
	 * }
	 */
}
