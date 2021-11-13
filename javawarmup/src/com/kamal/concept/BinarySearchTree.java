package com.kamal.concept;

public class BinarySearchTree {

	BinarySearchTree rootNode;//fixing our root node to be used for identifying and looping through

	int data;//data of each of node

	BinarySearchTree leftNode;

	BinarySearchTree rightNode;

	void addNode(int nodeData) {

		BinarySearchTree newNode = new BinarySearchTree();
		newNode.data = nodeData;

		BinarySearchTree temp = rootNode;

		if (temp == null) {
			rootNode = new BinarySearchTree();
			rootNode = newNode;

			System.out.println("Root node added : " + rootNode.data);
			return;
		} else {
			while (temp != null) {
				// System.out.println("temp data" + temp.data);
				System.out.println();
				if (nodeData <= temp.data) {
					if (temp.leftNode == null) {
						temp.leftNode = newNode;
						System.out.println("Node added at left subtree" + newNode.data);
						return;
					}
					temp = temp.leftNode;
				} else {
					if (temp.rightNode == null) {
						temp.rightNode = newNode;
						System.out.println("Node added at right subtree" + newNode.data);
						return;
					}
					temp = temp.rightNode;
				}
			}
		}

	}

	void inOrderTraversal() { // trying inorder traversal by while loop
		BinarySearchTree temp = rootNode;
		if (temp == null) {
			System.out.println("Tree is emtpy");
			return;
		} else {

			while (temp != null) {
				if (temp.leftNode != null) {
					temp = temp.leftNode;
				} else {
					System.out.println("left node visited");
				}
			}

		}
	}

	void printInorderTree() {
		inOrderByRecursion(rootNode);//Traversal techniques implemented by Recursion
	}

	void inOrderByRecursion(BinarySearchTree bst) {

		if (bst == null) {//Basically stack trace mechanism is used with recursion a method is stack trace in maintained after completion it is popped out
			return;
		}

		inOrderByRecursion(bst.leftNode);
		System.out.println(bst.data + " ");
		inOrderByRecursion(bst.rightNode);

	}

	void printPostOrderTree() {
		postOrderByRecursion(rootNode);
		System.out.println();
	}

	void postOrderByRecursion(BinarySearchTree node) {
		if (node == null) {//similarly same recursion and stack mechanism is used in Post order technique
			return;
		}

		postOrderByRecursion(node.leftNode);
		postOrderByRecursion(node.rightNode);
		System.out.println(" " + node.data);
	}

	void printPreOrder() {
		preOrderByRecursion(rootNode);
		System.out.println();
	}

	void preOrderByRecursion(BinarySearchTree node) {
		if (node == null) {//similarly same recursion and stack mechanism is used in Pre order technique
			return;
		}

		System.out.println(" " + node.data);
		preOrderByRecursion(node.leftNode);
		preOrderByRecursion(node.rightNode);
	}

}
