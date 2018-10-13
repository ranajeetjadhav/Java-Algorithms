package com.algo.tree;

public class BinaryTree {
	class Node{
		int key;
		Node left, right;
		
		public Node(int key){
			this.key = key;
			this.left = null;
			this.right = null;
		}
	}
		
	Node root;
	
	public BinaryTree(){
		this.root = null;
	}

	public void insert(int key){
		root = insertRec(root, key);
	}
	
	private Node insertRec(Node root, int key){
		if(root == null){
			root = new Node(key);
			return root;
		}
		
		if(key < root.key){
			root.left = insertRec(root.left, key);
		}else if(key > root.key){
			root.right = insertRec(root.right, key);
		}
		return root;
	}
	
	public void inOrder(){
		inOrderRec(root);
	}
	
	public void preOrder(){
		preOrderRec(root);
	}
	
	public void postOrder(){
		postOrderRec(root);
	}
	
	private void inOrderRec(Node root){
		if(root != null){
			inOrderRec(root.left);
			System.out.print(root.key+" ");
			inOrderRec(root.right);
		}
	}
	
	private void preOrderRec(Node root){
		if(root != null){
			System.out.print(root.key+" ");
			preOrderRec(root.left);			
			preOrderRec(root.right);
		}
	}
	
	private void postOrderRec(Node root){
		if(root != null){
			postOrderRec(root.left);
			postOrderRec(root.right);
			System.out.print(root.key+" ");
		}
	}
}
