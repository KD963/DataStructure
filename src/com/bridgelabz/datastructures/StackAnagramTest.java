package com.bridgelabz.datastructures;

import java.util.Scanner;

import com.bridgelabz.utility.StackTest;
import com.bridgelabz.utility.UtilityPrimeAnagram;

public class StackAnagramTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the number");
		int number = scanner.nextInt();

		StackTest stack = new StackTest();
		UtilityPrimeAnagram util = new UtilityPrimeAnagram();
		int[] array = new int[168];
		array = util.Prime(number);
		array = util.Anagram(array);

		for (int i = 0; i < array.length; i++) {
			if (array[i] != 0) {
				stack.push(array[i]);
			}

		}
		stack.display();
		scanner.close();
	}

}
