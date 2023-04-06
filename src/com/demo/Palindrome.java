package com.demo;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		//Scanner in = new Scanner(System.in);
		//System.out.println();
		//String input = in.nextLine();
		//System.out.println();
		int r,sum=0,temp;    
		  int n=453;//It is the number variable to be checked for palindrome  
		  
		  temp=n;    
		  
		  while(n>0){    
		   r=n%10;  //getting remainder  
		   sum=(sum*10)+r;    
		   n=n/10;    
		  }    
		  if(temp==sum)    
		   System.out.println("palindrome number ");    
		  else    
		   System.out.println("not palindrome");   

	}

}
