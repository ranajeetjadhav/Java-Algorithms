package com.algo.sort.misc;

import com.algo.stack.Stack;

public class BalancedParanthesis {

	public static void main(String[] args) {
		String str = "({[]})";
		
		if(areParanthesisBalanced(str)){
			System.out.println("Paranthesis are balanced");
		}else{
			System.out.println("Paranthesis are not balanced");
		}
	}
	
	private static boolean areParanthesisBalanced(String str){
		
		char charArr[] = str.toCharArray();
		int length = charArr.length;
		Stack<Character> stack = new Stack<>(length);
		
		for(int i = 0; i < length; i++){
			
			if(charArr[i] == '{' || charArr[i] == '[' || charArr[i] == '('){
				stack.push(charArr[i]);
			}
			
			if(charArr[i] == '}' || charArr[i] == ']' || charArr[i] == ')'){
				
				if(stack.isEmpty()){
					return false;
				}
				
				if(!isMatchingPair(stack.pop(), charArr[i])){
					return false;
				}
			}
		}
		
		if(stack.isEmpty())
			return true;
		else
			return false;
	}
	
	private static boolean isMatchingPair(char openPar, char closePar){
		if(openPar == '(' && closePar == ')'){
			return true;
		}else if(openPar == '{' && closePar == '}'){
			return true;
		}else if(openPar == '[' && closePar == ']'){
			return true;
		}else{
			return false;
		}
	}
}
