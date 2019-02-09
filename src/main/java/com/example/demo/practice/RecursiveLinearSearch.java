package com.example.demo.practice;

public class RecursiveLinearSearch {

	static int arr[]= {20,17,3,89,34};
	
	public static void main(String[] args) {
		
		int x=16;
		
		int index= recursiveLinearSearch(arr, 0, arr.length-1, x);
		if(index!=-1) {
			System.out.println("Element "+arr[index]+" found at "+index+" index");
		}else {
			System.out.println("not found.");
		}
	     
		
	}

	
	private static int recursiveLinearSearch(int[] arr, int l, int r, int x) {
		if(r < l) return -1;
		if(arr[l]==x) return l;
		if(arr[r]==x) return r;
		return recursiveLinearSearch(arr, l+1, r-1, x);
		
	}

}
