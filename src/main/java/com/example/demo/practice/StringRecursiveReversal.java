package com.example.demo.practice;

public class StringRecursiveReversal {
	String  reverse ="";
	
	public static void main(String[] args) {
		StringRecursiveReversal str=new StringRecursiveReversal();
		System.out.println(str.reverse("Yakambram"));
		System.out.println(str.stringReverse("Yakambram"));
	}

	private  String stringReverse(String str) {
		if(str.length()==1) return str;
	    return reverse+=str.charAt(str.length()-1)+stringReverse(str.substring(0, str.length()-1));
	}

	
	private String reverse(String str) {
		if(str ==null || str.length()<=1) {
			return str;
		}
		else {
			return reverse(str.substring(1))+str.charAt(0);
		}
	}
}
