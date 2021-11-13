package com.kamal.concept;

public class StackOverFlow {
	
	
	public void method2(){
		System.out.println("inside method 2");
		method1();
	}
	
	
	
	public void method1(){
		System.out.println("Inside method 1");
		method2();
	}
	
	public static void main(String[] args){
		StackOverFlow overFlow = new StackOverFlow();
		
		try{
		System.out.println("before Method 1 called");
		overFlow.method1();
		System.out.println("Method 1 called");
		}
		catch(Exception e){
			System.out.println("caught error");
			
		}
	}

}
