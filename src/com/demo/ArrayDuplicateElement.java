package com.demo;

import java.util.Arrays;
import java.util.HashSet;



public class ArrayDuplicateElement {

	public static void main(String[] args) {
		
	
		String arr[]= {"java","aruna","sujatha","sujatha"};
		
		HashSet<String>langs=new HashSet<>();
		
		boolean flag=false;
		
		for(String l:arr) {
			if(langs.add(l)==false) {
				System.out.println("Found Duplicate Element:"+ 1);
				
			flag=true;
		}
		if(flag=false) {
			System.out.println("not Found Duplicate Element");
	
			
		}

	}
		String [] array = {"anps", "anps", "anps", "bbo", "ehllo"};
		// If you already are assured that the strings in the array are sorted
		// then the sort is not necessary. 
		Arrays.sort(array);
		for(int i = 0; i < array.length; i++){
		    if((i+1)==array.length || !array[i].equals(array[(i+1)])){
		        System.out.println(array[i]);
		    } else {
		        System.out.print(array[i]+" ");
		    }
		}
		}
}


