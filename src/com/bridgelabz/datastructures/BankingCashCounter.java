package com.bridgelabz.datastructures;

import java.util.Scanner;

import com.bridgelabz.utility.QueueClass;

public class BankingCashCounter {
	static double amount = 0;

	public void withdraw(double balance) {
		System.out.println("Withdraw");

		if (balance > amount) {
			System.out.println("less amount");
		} else {
			amount = amount - balance;
			System.out.println("Amount = " + amount);
		}
	}

	public void deposite(double cash) {
		System.out.println("Deposite");
		amount = amount + cash;
		System.out.println("Amount is " + amount + "deposite amount is " + cash + " Total Amount " + amount);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		QueueClass<Integer> queue = new QueueClass<>();

		BankingCashCounter bank = new BankingCashCounter();

		System.out.println("Enter the number of person");
		//int a = scanner.nextInt();

		char ch1;
		do {
			System.out.println("Welcome to the ATM");
			System.out.println("Enter your choice ");
			System.out.println("1. Withdraw ");
			System.out.println("2. Deposite ");
			System.out.println("3. Exit ");
			int ch = scanner.nextInt();

			switch (ch) {
			case 1:
				System.out.println("1.Withdraw");
				System.out.println("Enter person ");
				queue.enqueue(scanner.nextInt());
				System.out.println("Enter withdraw amount");
				bank.withdraw(scanner.nextDouble());
				queue.dequeue();
				System.out.println("Exit Person");

				break;
			case 2:
				System.out.println("2.Deposite");
				System.out.println("Enter person ");
				queue.enqueue(scanner.nextInt());
				System.out.println("Enter deposite amount");
				bank.deposite(scanner.nextDouble());
				queue.dequeue();
				System.out.println("Exit Person");
				break;
			case 3:
				System.out.println("3. Exit");
				System.exit(0);
				break;

			default:
				System.out.println("Invalid choice");
			}
			System.out.println("Do you want to continue [y/n]");
			ch1 = scanner.next().charAt(0);
		} while (ch1 == 'Y' || ch1 == 'y');

	}

}
