package com.kamal.concept;

public class Problems {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// This problem is about switching logging from different devices and
				// counting it. let suppose user is logged in through app for 1AM then
				// logoff and relogin at 2AM via Web UI it should give count as 1 and
				// then log off relogin through web it should give as count 1 only
				int arr[] = { 1, 2, 3, 5, 7 };
				int arr2[] = { 2, 4, 6, 8 };
				int temp = 0;
				// int finArray[] = new int[arr.length+arr.length];
				for (int i = 0; i < arr.length; i++) {
					for (int j = 0; j < arr2.length; j++) {
						// temp = arr2[j];
						if (arr2[j] >= arr[i]) {
							temp++;
							break;
							// return;

						}
					}
				}

				System.out.println(temp);

				System.out.println("temp  ====");
				
				int num = 4325;
				int revNum=0;
				
				while(num!=0){
					System.out.println(num%10);//getting each digit as remainder
					int temp1 = num%10;
					revNum = temp1 + revNum*10;//reversing a number
					num=num/10;//updating a number to get next digit
					
					
				}
				
				System.out.println("Reverse of a number is : "+revNum);
				
				


	}

}
