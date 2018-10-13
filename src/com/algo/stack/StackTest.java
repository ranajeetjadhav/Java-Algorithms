package com.algo.stack;

public class StackTest {

	public static void main(String[] args) {
		Stack stack = new Stack(3);
		
		stack.push(1);
		stack.push(2);
		stack.push(3);
		//stack.push(4);
		//stack.push(5);
		System.out.println(stack.isEmpty());
		System.out.println(stack.size());
		
		System.out.println(stack.toString());
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		//System.out.println(stack.pop());
		//System.out.println(stack.pop());
		//System.out.println(stack.pop());
		//System.out.println(stack.pop());
		System.out.println(stack.display());
		System.out.println(stack.size());
	}

}
