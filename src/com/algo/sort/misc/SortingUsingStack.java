package com.algo.sort.misc;

import java.util.Iterator;
import java.util.Stack;

public class SortingUsingStack {

	public static void main(String[] args) {
		String str = "geeksforgeeks";
		Stack<Character> stack = new Stack<>();
		Stack<Character> tmpStack = new Stack<>();
		
		char charArr[] = str.toCharArray();
		int length = charArr.length;
		
		if(length > 0){
			for(int i = 0; i<length; i++){
				if(stack.isEmpty()){
					stack.push(charArr[i]);
				}else{
					if(charArr[i] < stack.peek()){
						while(!stack.isEmpty() && charArr[i] < stack.peek()){
							tmpStack.push(stack.pop());
						}
						stack.push(charArr[i]);
						Iterator<Character> tmpStackIterator = tmpStack.iterator();
						while(tmpStackIterator.hasNext()){
							stack.push(tmpStack.pop());
						}
					}else{
						stack.push(charArr[i]);
					}
				}
			}
		}
		
		System.out.println(stack);
	}

}
