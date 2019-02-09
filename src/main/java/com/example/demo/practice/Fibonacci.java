package com.example.demo.practice;

public class Fibonacci {
	
	public static void main(String[] args) {
		  for(int i=1; i<=10; i++){
			   System.out.print(fibonacci(i) +" "); 
			}

	}

	private static int fibonacci(int i) {
		  if (i <= 1) return i;
		
		  return   fibonacci(i-1)+fibonacci(i-2);
	}

}
