package com.bridgelabz.datastructures;

import java.util.Scanner;

import com.bridgelabz.utility.QueueTest;
import com.bridgelabz.utility.UtilityPrimeAnagram;

public class QueueAnagramTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number ");
		int number = scanner.nextInt();

		UtilityPrimeAnagram util = new UtilityPrimeAnagram();
		QueueTest queue = new QueueTest();
		int[] array = new int[168];

		array = util.Prime(number);
		array = util.Anagram(array);

		for (int i = 0; i < array.length; i++) {
			if (array[i] != 0) {
				queue.enqueue(array[i]);
			}
		}
		queue.display();
		scanner.close();
	}

}
