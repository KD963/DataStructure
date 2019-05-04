package com.bridgelabz.utility;

public class StackTest {

	Node head;

	public class Node {
		int data;
		Node next;

		Node() {
			// this.data = data;
			this.next = null;
		}
	}

	// push
	public void push(int data) {
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = head;
		head = newNode;
	}

	// pop
	public int pop() {
		Node temp = head;
		head = head.next;
		return temp.data;
	}

	// isEmpty
	public boolean isEmpty() {
		if (head == null) {
			return true;
		} else {
			return false;
		}
	}

	// peek
	public int peek() {
		return head.data;
	}

	// size
	public int size(Node head) {
		Node current = head;
		int count = 0;
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