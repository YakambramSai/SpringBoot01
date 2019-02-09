/**
 * 
 */
package com.example.demo.practice.exceptions;

/**
 * @author kyakambr
 *
 */
public class ReturnValueFromTryCatchFinally {
	
	
	
	public static void main(String[] args) {
		int i= returnValueMethod();
		System.out.println(i);
		
	}

	/**
	 * @return
	 */
	private static int returnValueMethod() {

       int i=0;
       try {
    	   i=1;
    	   return i;
       }catch(Exception e){
    	   i=2;
    	   return i;
       }finally {
    	   i=3;
    	   System.out.println("finally Xj"+i);
    	  // return i;
       }
		//return 4;
	}

}
