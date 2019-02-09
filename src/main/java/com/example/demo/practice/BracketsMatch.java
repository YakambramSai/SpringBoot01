package com.example.demo.practice;

import java.util.Stack;

public class BracketsMatch {

	public static void main(String[] args) {
		
		char exp[] = {'{','(','}',')','}','[',']'};
		
		if(areParenthesisBalanced(exp)) {
			System.out.println("Balanced.");
		}else {
			System.out.println("Not Balanced.");
		}

	}

	private static boolean areParenthesisBalanced(char[] exp) {
		Stack<Character> stack =new Stack<Character>();
		
		for(int i=0; i<exp.length; i++) {
			
			if(exp[i]=='{' || exp[i]=='(' || exp[i]=='[') 
				stack.push(exp[i]);
			
			if(exp[i]=='}' || exp[i]==')' || exp[i]==']') {
				
				if(stack.isEmpty()) {
					return false;
				}
				
				else if(!matchedPaires(stack.pop(), exp[i])) {
					return false;
				}
			}
			
		}
		
		 if (stack.isEmpty()) return true; else return false;
		
	}

	private static boolean matchedPaires(char c, char c2) {
		if(c=='{' && c2=='}') {
			return true;
		}
		
		if(c=='[' && c2==']') {
			return true;
		}
		
		if(c=='(' && c2==')') {
			return true;
		}
		return false;
	}

}
