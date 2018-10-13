package com.algo.stack;

import java.util.Arrays;

public class Stack<E> {

	Object stackArr[];
	int top;
	
	public Stack(){
		stackArr = new Object[5];
		top = 0;
	}
	
	public Stack(int size){
		stackArr = new Object[size];
		top = 0;
	}
	
	public boolean isEmpty(){
		if(top == 0)
			return true;
		
		return false;
	}
	
	private boolean isFull(){
		if(top == stackArr.length)
			return true;
		
		return false;
	}
	
	public int size(){
		return top;
	}
	
	public void push(E num){
		if(isFull()){
			throw new ArrayIndexOutOfBoundsException("Stack overflow");
		}
		
		stackArr[top] = num;
		top++;
	}
	
	public E pop(){
		if(isEmpty()){
			throw new ArithmeticException("Stack underflow");
		}
		
		E num = (E) stackArr[top-1];
		top--;
		return num;
	}
	
	public E peek(){
		if(isEmpty()){
			throw new ArithmeticException("Stack is underflow");
		}
		
		return (E) stackArr[top-1];
	}

	@Override
	public String toString() {
		return Arrays.toString(stackArr);
	}
	
	public String display(){
		StringBuffer buff = new StringBuffer();
		buff.append("[");
		for(int i = 0; i< top; i++){
			buff.append((stackArr[i]+" "));
			
		}
		buff.append("]");
		
		return new String(buff);
	}
}
