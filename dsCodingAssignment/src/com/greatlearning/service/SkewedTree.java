package com.greatlearning.service;

import com.greatlearning.node.Node;

public class SkewedTree {
	public Node node;
	public Node prevNode = null;
	public Node headNode = null;

	// wrapper function to call the recursive functions
	public void bstToSkewedTree(Node root) {
		skewedBST(root);
		traverseRightSkewed(headNode);
	}

	public void skewedBST(Node root) {
		// Base Case
		if (root == null) {
			return;
		}

		// recursive call to traverse left nodes
		skewedBST(root.left);

		// check if the root Node of the skewed tree is not defined
		if (headNode == null) {
			headNode = root;
			root.left = null;
			prevNode = root;
		} else {
			prevNode.right = root;
			root.left = null;
			prevNode = root;
		}

		// recursive call to traverse right nodes
		skewedBST(root.right);
	}

	// Recursive function to traverse the right skewed tree
	public void traverseRightSkewed(Node root) {
		// base case
		if (root == null) {
			return;
		}
		System.out.print(root.data + " --> ");
		traverseRightSkewed(root.right);
	}

}
