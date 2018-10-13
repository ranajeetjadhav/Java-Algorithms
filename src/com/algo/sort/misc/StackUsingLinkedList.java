package com.algo.sort.misc;

import com.algo.stack.LinkedList;

public class StackUsingLinkedList {

	LinkedList list;
	
	public StackUsingLinkedList(){
		list = new LinkedList();
	}
	
	public void push(int num){
		list.addLast(num);
	}
	
	public int pop(){
		
		int num = list.removeLast();
		
		if(num <= -1){
			throw new ArithmeticException("Stack is empty");
		}
		
		return num;
	}
	
	public int peek(){
		if(isEmpty()){
			throw new ArithmeticException("Stack is empty");
		}
		
		return list.getLastElement();
	}

	public boolean isEmpty(){
		return list.isEmpty();
	}
	
	public int size(){
		return list.size();
	}
	
	public String toString() {
		return list.display();
	}
}
