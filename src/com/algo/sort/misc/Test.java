package com.algo.sort.misc;

public class Test {

	public static void main(String[] args) {
		StackUsingLinkedList stack = new StackUsingLinkedList();
		
		stack.push(12);
		stack.push(13);
		stack.push(14);
		stack.push(15);
		System.out.println(stack.toString());
		stack.pop(); //15
		System.out.println(stack.toString());
		stack.pop(); // 14
		System.out.println(stack.toString());
		stack.pop(); // 13
		System.out.println(stack.toString());
		stack.pop(); // 12
		System.out.println(stack.toString());
		stack.pop();
	}

}
