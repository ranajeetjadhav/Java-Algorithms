package com.algo.sort.misc;

import com.algo.stack.Stack;

public class ReverseStringUsingStack {

	public static void main(String[] args) {
		StringBuffer buff = new StringBuffer("geeksforgeeks");
		
		reverseString(buff);
		System.out.println(buff);
	}

	private static void reverseString(StringBuffer str){
		int length = str.length();
		Stack<Character> stack = new Stack(length);

		for (int i = 0; i < length; i++) {
			stack.push(str.charAt(i));
		}
		
		for (int i = 0; i < length; i++) {
			str.setCharAt(i, stack.pop());
		}
	}
	
}
