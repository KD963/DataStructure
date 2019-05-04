package com.bridgelabz.utility;

public class QueueTest {

	Node head = null;
	Node tail = null;

	public class Node {
		int data;
		Node next;

		Node() {
			//this.data = data;
			this.next = null;
		}

	}

	// enqueue
	public void enqueue(int data) {
		/*
		 * Node node = new Node(); while (tail != null) { tail.next = node; } node =
		 * tail; if (head == null) { head = node; }
		 */
		Node node = new Node();
		node.data = data;
		node.next = null;
		if (head == null) {
			head = node;
			tail = node;
		} else {
			tail.next = node;
			tail = node;
		}
	}

	// dequeue
	public void dequeue() {
		//Node node = head;
		head = head.next;
	}

	// isEmpty
	public boolean isEmpty() {
		if (head == null) {
			return true;
		} else {
			return false;
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

	// display
	public void display() {
		Node current = head;
		while (current != null) {
			System.out.println(current.data);
			current = current.next;
		}
	}


}
