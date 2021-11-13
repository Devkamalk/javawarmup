package com.kamal.lambda;

interface Abc{
	 void showInner();
	 //void showLabmda(int i);
}

/*class Xyz implements Abc{
	
	@Override
	public void show(){
		System.out.println("Hii");
	}
	
}*/


public class LambdaExp {

	public static void main(String[] args) {

		/*Abc obj= new Abc(){ //Anonymous inner class
			
			public void showInner(){
				System.out.println("hii");
			}
			
			public void showLabmda(){
				System.out.println("Hello lamnda");
			}
		};*/
		
		
		
		Abc obj1 = () -> System.out.println("Hii");// lambda -> and the expression is implementation of some interface
		//Abc obj2 = (int i) -> System.out.println("Hii"+i);
				
		obj1.showInner();
		 
		//obj2.showLabmda(5);
		

	}

}
