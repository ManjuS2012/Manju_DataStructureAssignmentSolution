package com.greatlearning.driver;

import com.greatlearning.node.Node;
import com.greatlearning.service.SkewedTree;

public class MainBST {

	public Node node;

	public static void main(String[] args) {
		// Build a tree
		MainBST tree = new MainBST();
		tree.node = new Node(50);
		tree.node.left = new Node(30);
		tree.node.right = new Node(60);
		tree.node.left.left = new Node(10);
		tree.node.right.left = new Node(55);
		
		//object for service class
		SkewedTree skewedTree = new SkewedTree();
		
		System.out.print("Modified BST with the node values present in ascending order. \n");
		skewedTree.bstToSkewedTree(tree.node);		
	}
}
