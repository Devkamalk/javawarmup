package com.kamal.concept;

public class DoubleLinkedListImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DoubleLinkedList node = new DoubleLinkedList();
		node.addNode(10);
		node.addNode(14);
		node.addNode(15);
		node.addNode(34);
		node.addNode(56);
		node.addNode(11);
		System.out.println("==================Displaying all the element from double linked list====================");

		node.displayAllNodes();//display all nodes after performing add operations
		System.out.println();
		System.out.println("=======================Deleting node==================================================== ");
		node.deleteNode(10);
		System.out.println("=======================Nodes after Deleting items==================================================== ");
		System.out.println();
		
		node.displayAllNodes();//display all nodes after deletion operation
		
		//Thanks for watching
	}

}
