/**
 * 
 */
package com.example.demo.practice.exceptions;

import java.util.Scanner;
import java.lang.ArithmeticException;

public class AnonymouseExceptionDemo {


	public static void main(String[] args) {
		
		Integer balance=5000;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter your amount to withdraw.");
		int withdrawAmount=scanner.nextInt();
		scanner.close();
		try {
		if(withdrawAmount > balance) {
			throw new ArithmeticException() {
				
				/**
				 * 
				 */
				private static final long serialVersionUID = 1L;

				public String toString() {
					return "Balance is not suffient in your account";
				}
				
			};
		}

		}catch(ArithmeticException ae) {
			System.out.println(ae);
		}
		
	}

}
