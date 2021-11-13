package com.kamal.concept;

public class StackImplementation {
	int maxsize = 1000;// Maxsize to know the limit of the stack to decide it is full
	int top = -1;// to track stack is empty or filled with which index to fetch
					// items

	int array[] = new int[maxsize];//Array to push pop elements

	int push(int item) {
		if (top == maxsize - 1) {
			System.out.println("Stack is overflow try popping items then push");
			return -1;
		} else {
			array[++top] = item;
		}
		System.out.println("item inserted " + item);
		return item;
	}

	int pop() {
		if (top == -1) {
			System.out.println("Stack is underflow try pushing items then pop");
			return 0;
		} else {
			array[top] = 0;
			--top;
		}
		System.out.println("item popped successfully");
		return 1;
	}

	int peek() {
		if (top == -1) {
			System.out.println("Stack is empty");
			return 0;
		} else {
			System.out.println("top item is " + array[top]);
			return array[top];
		}
	}

	public static void main(String[] args) {
		StackImplementation stack = new StackImplementation();

		System.out.println("======================Stack push operation================");
		System.out.println();// Added sysout statements to make the out more
								// readable

		stack.push(1);//pushing items in stack
		stack.push(2);
		stack.push(3);
		stack.push(6);

		System.out.println();// Added sysout statements to make the out more
								// readable

		System.out.println("=======================Stack pop opertion==================");
		System.out.println();// Added sysout statements to make the out more
								// readable
		stack.pop();
		stack.pop();
		System.out.println();// Added sysout statements to make the out more
								// readable

		System.out.println("========================Peek Top element====================");
		System.out.println();// Added sysout statements to make the out more
								// readable
		System.out.println(stack.peek());

		System.out.println();
		System.out.println("==================Loop to print each element from stack====");
		System.out.println();
		for (int i = 0; i <= stack.top; i++) { // loop to print each element int the stack
			System.out.println(stack.array[i]);

		}

	}

}
