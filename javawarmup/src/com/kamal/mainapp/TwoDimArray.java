package com.kamal.mainapp;

import java.util.Arrays;
import java.util.List;

public class TwoDimArray {

	public static void main(String[] args) {
		
		int[] ar1 = {1,1,1,1};
		//ar1={1,1,1};
		System.out.println("Single dimensional Array 1 type");
		System.out.println(Arrays.toString(ar1)+"\n");
		// TODO Auto-generated method stub
		
		System.out.println(Arrays.asList(ar1)+"\n");
		List<int[]> ar5=  Arrays.asList(ar1);
		//ar5.add(ar1);
		System.out.println("list"+Arrays.asList(ar1));
		//String ar5 = Arrays.toString(ar1);
		
		int[] ar2 = new int[6];
		/*ar2={4,5,6};*/
		ar2[0]=22;
		ar2[1]=22;
		System.out.println("Single dimensional Array 2 type");
		System.out.println(ar2+"\n");
		
		
		int [] ar3;
		ar3= ar2;
		
		System.out.println("Single dimensional copy Array 3 type");
		System.out.println(ar3);
		
		int ar4[] = new int[6];
		/*ar2={4,5,6};*/
		ar2[0]=22;
		ar2[1]=22;
		System.out.println("Single dimensional Array 2 type");
		System.out.println(ar2+"\n");
		
		System.out.println("2 Dimensional Array\n");
		
		//4X3 two dimensional array
		int arr2D[][] = new int[][] { { 1, 1, 1, 1, 1, 1 },
			 						  { 2, 2, 2, 2, 2, 2 },
			 						  { 3, 3, 3, 3, 3, 3 },
			 						  { 4, 4, 4, 4, 4, 4 },
			 						  { 5, 5, 5, 5, 5, 5 },
			 						  { 6, 6, 6, 6, 6, 6 } };
		System.out.println("\n 2 dimesional length"+arr2D.length);
		for(int arr[]:arr2D){
			System.out.println(Arrays.toString(arr));
		}
		
		System.out.println("for loop iteration 2 Dimensional Array\n");
		int sum2=0;
		int arr2D1[][] = new int[3][3];
		for(int i=0;i<arr2D.length-3;i++){
			
			for(int j=0;j<arr2D[i].length-3;j++){
				System.out.print(arr2D[i][j]+" ");
				if(i%2==0){
					arr2D1[i][j]=arr2D[i][j];
					sum2=sum2+arr2D[i][j];
				} else if(i%2!=0&&j==1) {
					sum2=sum2+arr2D[i][j];
					arr2D1[i][j]=arr2D[i][j];
				}
			}
			System.out.println();
			
		}
		System.out.print(sum2 + "======2D=========================== ");
		System.out.println();
		
		// two dimensional Hour glass problem
		int sum=0;
		for (int i = 0; i < 3; i++) {

			for (int j = 0; j < 3; j++) {
				//System.out.print(arr2D[i][j]+" ");
				sum = arr2D[i][j] + arr2D[i][j+1] + arr2D[i][j+2];
				sum = arr2D[i+1][j+1];
				sum = arr2D[i+2][j]+arr2D[i+2][j+1]+arr2D[i+2][j+2];
				System.out.println(sum);
				}
			
				
			}
			

		}
		


}
