package com.kamal.mainapp;

import java.util.Arrays;

public class RotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar={0,1,2,3,4,5};
		for(int i=0;i<2;i++){
			int temp=0;
			temp = ar[0];
			ar[0]=ar[1];
			ar[1]=ar[2];
			ar[2]=ar[3];
			ar[3]=ar[4];
			ar[4]=ar[5];
			ar[5]=temp;
		}
		System.out.println(Arrays.toString(ar));

	}

}
