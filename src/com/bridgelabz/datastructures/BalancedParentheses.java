package com.bridgelabz.datastructures;

import com.bridgelabz.utility.StackClass;

public class BalancedParentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("String : (5+6)∗(7+8)/(4+3)(5+6)∗(7+8)/(4+3)");
		String str = "(5+6)∗(7+8)/(4+3)(5+6)∗(7+8)/(4+3)";
		StackClass<Character> stack = new StackClass<>();
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == '(') {
				stack.push(ch[i]);

			} else if (ch[i] == ')') {
				stack.pop();

			}

		}
		if (stack.isEmpty()) {
			System.out.println("Balanced parentheses ");
		} else {
			System.out.println("Unbalanced parentheses");
		}

	}

}
