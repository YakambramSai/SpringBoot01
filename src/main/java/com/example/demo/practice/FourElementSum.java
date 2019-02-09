package com.example.demo.practice;

public class FourElementSum {

	public static void main(String[] args) {
		
		int arr[] = {1, 5 ,1 ,0 ,6 ,0, 1 ,0 ,6 ,0};
		int key=7;
		findFourElements(arr, key);

	}

	private static void findFourElements(int[] arr, int key) {
      
		int avg=0, count=0;
		for(int i=0; i<arr.length; i++) {
			avg+=arr[i];
			if(count==4 && avg==key) {
				System.out.println("found");
				
				continue;
			}
				
			
		}

		
	}

}
