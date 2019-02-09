/**
 * 
 */
package com.example.demo.practice.exceptions;

/**
 * @author kyakambr
 *
 */
public class StackOverflowErrorDemo {

	static void method1() {
		method2();
	}
	static void method2() {
		method1();
	}
	public static void main(String[] args) {
		method1();
	}

}
