/**
 * 
 */
package com.example.demo.practice.exceptions;

/**
 * @author kyakambr
 *
 */
public class SingleCatchBlockPipe {
	
	
	public static void main(String[] args) {
		
		String s[]= {"abc", "123" , null , "345"};
		
		for(int i=0; i<6; i++) {
		  try {	
			
			int t=s[i].length()+Integer.parseInt(s[i]);
		   }catch(NumberFormatException |ArrayIndexOutOfBoundsException   | NullPointerException e){
			   System.out.println("This Statement will be executed."+e.getClass());
			   
		   }
		}
		
	}

}
