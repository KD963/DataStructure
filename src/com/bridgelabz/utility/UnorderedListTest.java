package com.bridgelabz.utility;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class UnorderedListTest {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		ListUtility<String> listUtility = new ListUtility<>();

		Scanner scanner = new Scanner(new File("file1.txt"));
		Scanner words = new Scanner(System.in);
		while (scanner.hasNext()) {
			String string = scanner.next();
			listUtility.add(string);
		}
		listUtility.display();

		listUtility.isEmpty();

		int length = listUtility.size();
		System.out.println("Length of the list is " + length);

		System.out.println("Enter the word to be search ");
		String string = words.next();
		if (listUtility.search(listUtility.head, string)) {
			System.out.println("element found  ");
			listUtility.pop(string);
			System.out.println("After pop");
			listUtility.display();

		} else {
			System.out.println("element not found");
			listUtility.add(string);
			System.out.println("After add");
			listUtility.display();
		}

		scanner.close();
		words.close();

	}

}
