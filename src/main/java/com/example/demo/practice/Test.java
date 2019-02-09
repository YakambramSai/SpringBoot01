package com.example.demo.practice;

/**
 * @author kyakambr
 *
 */
public class Test {

	public static void main(String[] args) {
		int[] a = {12,3,4,5,5,67};
		int[] b=a;
	
		System.out.println("Before Change:");
		for(int i=0; i<b.length; i++) {
			System.out.print(b[i]+" ");
		} 
		   System.out.println();
		    a[2] = 56;     //Changing value of 3rd element of array 'a'
	        b[4] = 100;     //Changing value of 5th element of array 'b'
	       
	        System.out.println("After Change:");
	        for(int i=0; i<b.length; i++) {
	        	System.out.print(b[i]+" ");
			} 
	        
	        System.out.println();
	        int[] c = new int[a.length];             //Declaring and instantiating another array of ints with same length
	        
	        for (int i = 0; i < a.length; i++)
	        {
	           c[i] = a[i];
	        }

	        a[3] = 69;  
	        for(int i=0; i<c.length; i++) {
	        	System.out.print(c[i]+" ");
			} 
	}

}
