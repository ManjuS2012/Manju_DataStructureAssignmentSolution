package com.greatlearning.node;

/* A binary tree node has data, pointer to left child
and a pointer to right child */
public class Node {
	public int data;
	public Node left;
	public Node right;

	public Node(int item) {
		data = item;
		left = right = null;
	}
}
