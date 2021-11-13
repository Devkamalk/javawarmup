package com.kamal.mainapp;

import java.util.Arrays;

public class StringManip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = "UDDDUDUU";
		String[] str = input.split("");
		char[] ch = input.toCharArray();
	    int u=0;
	    int d=0,l=0;
	    for(char c : ch){
	        if(c=='U'){
	            l++;
	        } else{
	            l--;
	        } 
	        
	        if(c=='U'&&l==0)
	        d++;
	    }
	}

}
