package com.bridgelabz.utility;

public class DequeClass {
	char[] array = new char[10];

	int front = 0;
	int rear = 0;

	// addFront(item)
	public void addFront(char item) {
		if (isFull()) {
			System.out.println("Overflow");
		} else {
			for (int i = rear; i > front; i--) {
				array[i] = array[i - 1];
				array[front] = item;
				rear++;
			}
		}
	}

	// addRear(item)
	public void addRear(char item) {
		if (isFull()) {
			System.out.println("Overflow");
		} else {
			array[rear] = item;
			rear++;
		}

	}

	// removeFront
	public char removeFront() {
		if (isEmpty()) {
			System.out.println("Underflow");
			return ' ';
		} else {
			char ch = array[front];
			front++;
			return ch;
		}
	}

	// removeRear
	public char removeRear() {
		if (isEmpty()) {
			System.out.println("Underflow");
			return ' ';
		} else {
			rear--;
			char ch = array[rear];
			return ch;
		}
	}

	// isEmpty
	public boolean isEmpty() {
		if (front == rear) {
			return true;
		} else {
			return false;
		}
	}

	// isFull
	public boolean isFull() {
		if (rear == array.length) {
			return true;
		} else {
			return false;
		}
	}

	// size
	public int size() {
		int count = 0;
		for (int i = front; i < rear; i++) {
			count++;
		}
		return count;
	}

	// display
	public void display() {
		for (int i = front; i < rear; i++) {
			System.out.println(array[i]);
		}
	}

}
