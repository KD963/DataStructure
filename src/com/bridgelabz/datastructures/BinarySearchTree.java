package com.bridgelabz.datastructures;

public class BinarySearchTree {
	public int countTree(int numKeys) {

		if (numKeys <= 1) {
			return 1;

		} else {
			int sum = 0;
			int left, right, root;
			for (root = 1; root <= numKeys; root++) {
				left = countTree(root - 1);
				right = countTree(numKeys - root);
				sum += left * right;
			}
			return sum;

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearchTree tree = new BinarySearchTree();
		System.out.println("Number of node 5 : " + tree.countTree(5));
		System.out.println("Number of node 2 : " + tree.countTree(2));
	}

}
