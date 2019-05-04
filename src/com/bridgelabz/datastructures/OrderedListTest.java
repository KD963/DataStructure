package com.bridgelabz.datastructures;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

import com.bridgelabz.utility.ListUtility;

public class OrderedListTest {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		ListUtility<Integer> listUtility = new ListUtility<>();

		File file = new File("fileNumbers.txt");
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(file);
		@SuppressWarnings("resource")
		Scanner numbers = new Scanner(System.in);
		int len = (int) file.length();
		int array[] = new int[len];
		int i = 0;
		int number;
		while (scanner.hasNext()) {
			number = scanner.nextInt();
			array[i] = number;
			i++;

		}

		Arrays.sort(array);
		for (int j = array.length - 1; j >= 0; j--) {
			if (array[j] != 0)
				listUtility.add(array[j]);
		}
		System.out.println("After adding elements");
		listUtility.display();

		System.out.println("Searching for a number");
		int searchNumber = numbers.nextInt();
		if (listUtility.search(listUtility.head, searchNumber)) {
			System.out.println("Number found");
			listUtility.pop(searchNumber);
			System.out.println("After pop");
			listUtility.display();
		} else {
			System.out.println("Number not found");
			listUtility.add(searchNumber);
			System.out.println("After add");
			listUtility.display();
		}
	}

}
