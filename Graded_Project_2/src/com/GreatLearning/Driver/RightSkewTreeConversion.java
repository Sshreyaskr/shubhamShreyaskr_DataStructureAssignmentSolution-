package com.GreatLearning.Driver;

class Node {
	int val;
	Node left, right;

	// Helper function that allocates a new node
	// with the given data and NULL left and right
	// pointers.
	Node(int item) {
		val = item;
		left = right = null;
	}
}

public class RightSkewTreeConversion {

	public static Node node;
	static Node prevNode = null;
	static Node headNode = null;

	// Function to to flatten the binary
	// search tree into a skewed tree in
	// increasing / decreasing order
	static void flattenBTToSkewed(Node root) {

		// Base Case
		if (root == null) {
			return;
		}

		flattenBTToSkewed(root.left);

		Node rightNode = root.right;

		// Condition to check if the root Node
		// of the skewed tree is not defined
		if (headNode == null) {
			headNode = root;
			root.left = null;
			prevNode = root;
		} else {
			prevNode.right = root;
			root.left = null;
			prevNode = root;
		}

		flattenBTToSkewed(rightNode);
	}

	// Function to traverse the right
	// skewed tree using recursion
	static void traverseRightSkewed(Node root) {
		if (root == null) {
			return;
		}
		System.out.print(root.val + " ");
		traverseRightSkewed(root.right);
	}
	
	
	

	// Driver Code
	public static void main(String[] args) {
		RightSkewTreeConversion tree = new RightSkewTreeConversion();
		RightSkewTreeConversion.node = new Node(50);
		RightSkewTreeConversion.node.left = new Node(30);
		RightSkewTreeConversion.node.right = new Node(60);
		RightSkewTreeConversion.node.left.left = new Node(10);
		RightSkewTreeConversion.node.right.left = new Node(55);
        
		
		flattenBTToSkewed(node);
		

		System.out.println("The right skewed tree for the given Binary Search Tree is: ");
		traverseRightSkewed(headNode);
	}
}
