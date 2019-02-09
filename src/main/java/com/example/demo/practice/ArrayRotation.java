package com.example.demo.practice;

public class ArrayRotation {
	
	public static void main(String[] args) {
		 int arr[] = {1, 2, 3, 4, 5, 6,7,8,9,10,11,12};
	        printArray(arr);
	        rvereseArray(arr, 0, arr.length-1);
	        System.out.println("Reversed array is ");
	        printArray(arr);
	}

	private static void rvereseArray(int[] arr, int start, int end) {
		System.out.println(1);
		int temp;
		if(start>=end)
		  return;
		temp=arr[start];
		arr[start]=arr[end];
		arr[end]=temp;
		
		rvereseArray(arr, start+1, end-1);
		
	}

	private static void printArray(int[] arr) {
		for (int i=0; i <arr.length; i++)
              System.out.print(arr[i] + " ");
               System.out.println("");
	}

}
