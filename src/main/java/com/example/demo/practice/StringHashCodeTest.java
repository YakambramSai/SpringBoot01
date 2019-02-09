/**
 * 
 */
package com.example.demo.practice;

public class StringHashCodeTest {

	public static void main(String[] args) {
		
		String a ="Sai";
		String b=new String("Sai");
		if(a.equals(b)) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}

		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		
	}

}
