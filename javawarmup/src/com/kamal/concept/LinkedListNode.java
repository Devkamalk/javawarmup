package com.kamal.concept;

public class LinkedListNode {
	int data;
	LinkedListNode nextNode;
	LinkedListNode head;

	void addNode(int data) {

		LinkedListNode node = new LinkedListNode();
		node.data = data;
		node.nextNode = null;

		if (head == null) {
			head = node;
			System.out.println("Head Node added " + node.data);
		} else {
			LinkedListNode tempNode = head;

			while (tempNode.nextNode != null) {
				tempNode = tempNode.nextNode;

			}
			tempNode.nextNode = node;

			System.out.println("Node added " + node.data);
		}
	}

	void displayNodeData() {
		if (head == null) {
			System.out.println("Linked list is empty");
		} else {
			LinkedListNode temp = head;

			do {
				System.out.println("Current node data is: " + temp.data);
				temp = temp.nextNode;
			} while (temp != null);

		}
	}

	/*
	 * void deleteNode(int node){ //current code is not working //lets change
	 * the code by checking two nodes simultaneously current and next node then
	 * check values and assign ref to adjacent node LinkedListNode temp = head;
	 * if(temp==null){ System.out.println("Unable to find, list is empty"); }
	 * else if (temp.nextNode==null){ temp=null;
	 * System.out.println("last node is deleted");
	 * 
	 * } else { while(temp.nextNode!=null){ if(temp.data==node){
	 * System.out.println("Given node is deleted "+temp.data);
	 * temp=temp.nextNode; System.out.println("Given node is deleted"); break; }
	 * temp = temp.nextNode; } } }
	 */

	void deleteNodeSolution(int data) {
		LinkedListNode temp;
		if (head.data == data) {
			temp = head.nextNode;
			head = null;
			head = temp;
			System.out.println("Head node is deleted");
		} else {
			temp = head;
			LinkedListNode prevNode = null;
			while (temp.data != 0) { // reason why we are iterating over data
										// because last item will be skipped if
										// temp.nextNode is used so last element
										// will not be deleted
				if (temp.data != data) {
					prevNode = temp;
					temp = temp.nextNode;
				} else {
					prevNode.nextNode = temp.nextNode;
					temp = null;// deleted
					System.out.println("Given node is deleted");
					return;

				}
			}
		}
	}

}
