package com.algo.stack;

public class LinkedListTest {

	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
		linkedList.addFirst(1);
		linkedList.addFirst(2);
		//linkedList.display();
		
		//linkedList.addLast(3);
		//System.out.println(linkedList.remove());
		System.out.println(linkedList.display());
		System.out.println(linkedList.size());
		
		System.out.println(linkedList.removeLast());
		System.out.println(linkedList.display());
		System.out.println(linkedList.size());
		
		System.out.println(linkedList.removeLast());
		System.out.println(linkedList.display());
		System.out.println(linkedList.size());
		
	}

}
