package com.algo.stack;

public class LinkedList {

	Node root;
	
	public LinkedList() {		
		root = null;
	}
	
	public boolean isEmpty(){
		if(root == null)
			return true;
		
		return false;
	} 
	
	public void addFirst(int num){
		Node node = new Node(num, null);
		if(root == null){
			root = node;
		}else{
			node.next = root;
			root = node;
		}
	}
	
	public void addLast(int num){
		Node newNode = new Node(num, null);
		
		if(root == null){
			root = newNode;
		}else{
			Node node = getLastNode();
			node.next = newNode;
		}
	}
	
	private Node getLastNode(){
		Node node = root; 
		
		while(node.next!=null){
			node = node.next;
		}
		
		return node;
	}
	
	public int getLastElement(){
		Node node = root; 
		while(node.next!=null){
			node = node.next;
		}
		
		return node.num;
	}
	
	private Node getSecondLastNode(){
		Node node = root; 
		while(node.next.next!=null){
			node = node.next;
		}
		
		return node;
	}
	
	public void clear() {
		root = null;
	}
	
	public int remove(){
		if(isEmpty()){
			throw new ArithmeticException();
		}
		
		int num = root.num;
		root = root.next;
		return num;
	} 
	
	public int removeLast() {
		int num;
		if(size() == 0){
			return -1;
		}
		
		if(size() == 1){
			num = root.num;
			root = null;
			//System.out.println("hello");
		}else{
			Node node = getSecondLastNode();
			num = node.next.num;
			node.next = null;
		}
		return num;
	}
	
	public int size() {
		Node node = root;
		int elementCount = 0;
		while(node!=null){		
			node = node.next;
			++elementCount;
		}
		
		return elementCount;
	}
	
	public String display() {
		StringBuffer buff = new StringBuffer();
		buff.append("[ ");
		Node node = root;
		while(node!=null){
			buff.append(node.num+" ");
			node = node.next;
		}
		
		buff.append("]");
		
		return new String(buff);
	}
}

class Node{
	
	int num;
	Node next;
	
	public Node(int num, Node next){
		this.num = num;
		this.next = next;
	}
}