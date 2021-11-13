package com.kamal.concept;

public class LinkedListImplementation {
	
	public static void main(String[] args){
		
		LinkedListNode node = new LinkedListNode();
		
		node.addNode(5);//adding nodes
		
		node.addNode(10);
		
		node.addNode(15);
		
		node.addNode(20);
		
		node.addNode(25);
		
		node.displayNodeData();
		
		//node.deleteNode(25);
		
		node.deleteNodeSolution(25);//finally done need to complete other use cases woohooo
		
		node.displayNodeData();
		//implement double and circular linkedlist
		
		
		
	}

}
