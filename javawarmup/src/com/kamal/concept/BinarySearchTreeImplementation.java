package com.kamal.concept;

public class BinarySearchTreeImplementation {

	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();

		bst.addNode(10);
		bst.addNode(11);
		bst.addNode(9);
		bst.addNode(8);
		bst.addNode(10);

		System.out.println("==================================InOrder Traversal===================================");

		bst.printInorderTree();
		System.out.println();

		System.out.println("==================================PostOrder Traversal===================================");
		bst.printPostOrderTree();

		System.out.println();
		System.out.println("==================================PreOrder Traversal===================================");
		bst.printPreOrder();

				

	}

}
