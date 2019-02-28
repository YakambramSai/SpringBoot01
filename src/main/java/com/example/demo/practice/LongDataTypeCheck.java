/**
 * 
 */
package com.example.demo.practice;


public class LongDataTypeCheck {

	public static void main(String[] args) {
     long income = 200000, coverage;
     if(income<=500000)
    	 coverage=200000;
     else if(income >500000 && income <=1000000)
    	 coverage=300000;
     else 
    	 coverage =500000;
     
     System.out.println(coverage);

	}

}
