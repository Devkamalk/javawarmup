package com.kamal.concept;

public class DoubleLinkedList {

	DoubleLinkedList prevNode;

	int data;

	DoubleLinkedList nextNode;

	DoubleLinkedList headNode;

	void addNode(int item) {

		DoubleLinkedList tempNode = headNode;
		DoubleLinkedList newNode = new DoubleLinkedList();
		newNode.data = item;

		if (tempNode == null) {
			/* newNode.data = item; */

			headNode = newNode;
			System.out.println("Head node added : " + newNode.data);
			return;

		} else {
			while (tempNode.nextNode != null) {
				tempNode = tempNode.nextNode;
			}

			tempNode.nextNode = newNode;
			newNode.prevNode = tempNode; //Linking previous node missed in previous video here is the correction

			System.out.println("woohoo new Node has been added : " + newNode.data);
		}
	}

	void displayAllNodes() {
		DoubleLinkedList temp = headNode;
		if (temp == null) {
			System.out.println("Double Linked is empty unable to print any element");
		} else {
			do {
				System.out.println("Data in the node is :- " + temp.data);
				temp = temp.nextNode;
			} while (temp != null);
		}

	}

	void deleteNode(int item) {
		// in the next video thanks for watching
		DoubleLinkedList temp = headNode;
		if (temp == null) {
			System.out.println("Double linked list is empty unable to perform delete operation");
		} else {
			while (temp.data != 0) { // reason why we are iterating over data
										// because last item will be skipped if
										// temp.nextNode is used so last element
										// will not be deleted
				if (temp.data != item) {
					temp = temp.nextNode;//Here if element is not found switch to next iteration
				} else {
					if (headNode.data == item) { // if delete node is head 
						headNode = null;
						System.out.println("Deleted Node is head Node ");
						headNode = temp.nextNode;
						return;
					} else { // if delete node is other than head node delete and link previous node
						System.out.println("Deleting Node :- " + temp.data);
						DoubleLinkedList prev = temp.prevNode;
						prev.nextNode = temp.nextNode;
						temp = null;//deleted note
						System.out.println("Deletion operation successfully performed");
						return;
					}
				}
			}
		}
	}

}
