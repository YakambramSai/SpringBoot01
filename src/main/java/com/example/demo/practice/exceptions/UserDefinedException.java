/**
 * 
 */
package com.example.demo.practice.exceptions;

import java.util.Scanner;

class AgeIsNegativeException extends Exception {
	String errorMessage;
	public AgeIsNegativeException(String errorMessage) {
		this.errorMessage=errorMessage;
	}
	
	@Override
	public String toString() {
		return errorMessage;
		
	}
	
}

public class UserDefinedException {

	
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Age");
		
		int age=scanner.nextInt();
		try {
		if(age < 0) {
			
			throw new AgeIsNegativeException("Age is should not be negative.");
		   }
		}catch(AgeIsNegativeException ne){
			System.out.println(ne.toString());
		}

	}

}
