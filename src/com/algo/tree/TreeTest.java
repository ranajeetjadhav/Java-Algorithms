package com.algo.tree;

public class TreeTest {

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		
		tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);
        
       // System.out.println("=====In order=====");
        tree.inOrder();
        System.out.println();
        tree.preOrder();
        System.out.println();
        tree.postOrder();
	}

}
