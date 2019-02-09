/**
 * 
 */
package com.example.demo.practice;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		List<Parent> list=new ArrayList<Parent>();
		list.add(new Child1());
		
		list.add(new Child2());
		List<Child1> list2=new ArrayList<Child1>();
	}

}

interface Parent {
	public void display(); 
}


class Child1 implements Parent {

	
	@Override
	public void display() {
		System.out.println("Hello");
		
	}
	
}


class Child2 implements Parent {

	
	@Override
	public void display() {
		System.out.println("Hello");
		
	}
	
}