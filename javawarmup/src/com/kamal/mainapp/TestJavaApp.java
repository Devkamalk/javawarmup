package com.kamal.mainapp;

import java.util.*;
//Program to find no of pair in an array
public class TestJavaApp {
	
	public static void main(String[] args){
		//sample input
		int[] ar = {10, 20, 20, 10, 10, 30, 50, 10, 20};
		HashSet<Integer> list = new HashSet();
		//Counting pairs in an array
		int pairCount = 0;
		for(int i=0;i<ar.length;i++){
			int temp=ar[i];
			//count skip odd pairs
			int innerCount=0;
			if(temp!=0){
				for(int j=i+1;j<ar.length;j++){
					if(temp==ar[j]){
						if(innerCount%2==0){
							pairCount++;
						}
						ar[j]=0;
						innerCount++;
					}
				}
			}
		}
		/*int pairs = ar.length - list.size();*/
        
        System.out.println(pairCount);
        System.out.println(Arrays.toString(ar));
       /* System.out.println(list);*/
	}

}

/*int n=9;
int temp = 0;
int count = 1;
int k=0;
int[] cpyArr = new int[n];
for (int i = 0; i < ar.length; i++) {

	temp = ar[i];
	for (int j = i + 1; j < ar.length; j++) {
		if (temp == ar[j]&&ar[j]>0&&temp>0) {
			count = count + 1;
			cpyArr[k] = ar[j];
			ar[j]=0;
			// arr[]
		}
	}
	if (count % 2 == 1) {
		count = count - 1;
	}
}*/
