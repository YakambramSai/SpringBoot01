package com.example.demo.practice;

public class ObjectClassDemo {
	
	String propertyName1;
	String propertyName2;
	
	
  @Override
	public String toString() {
		return "ObjectClassDemo [propertyName1=" + propertyName1 + ", propertyName2=" + propertyName2 + "]";
	}

  
	public static void main(String[] args) {
		ObjectClassDemo bn=new ObjectClassDemo();
		System.out.println(bn.toString());
		bn.test();
		
	}


	private  void test() {
		System.out.println(getClass().getName());
		
	}
}
