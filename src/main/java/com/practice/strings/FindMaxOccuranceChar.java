
package com.practice.strings;

/**
 * @author kyakambr
 *  return maximum occurring character in  given input string.
 *  solution : sort the input string and then traversal through sorted string to
 *  find the character which is occurring maximum number of times.
 */
public class FindMaxOccuranceChar {
	
	static final int ASCII_SIZE=256;
	
	public static void main(String[] args) {
		String str="sample string aaa ccccc";
		System.out.println("the maximum number of times occurred character is:"+findMaxOccurredChar(str));
		
	}

	/**
	 * @param str
	 * @return
	 */
	private static char findMaxOccurredChar(String str) {
		
		//create an array to keep the count of individual characters.
		// initialize an array size with 0
		
		int count[]=new int[ASCII_SIZE];
		
		
		//construct the character array from input string.
		
		System.out.println("after initialized an array:");
		for(int i=0; i<count.length;i++)
			System.out.print(count[i]);
		
		int len=str.length();
		
		for(int i=0; i<len;i++)
			 count[str.charAt(i)]++;
		
		
		System.out.println("after keep inout string into the array");
		for(int i=0; i<len;i++)
			 System.out.print(count[str.charAt(i)]);
		
		
		
		System.out.println();
		// initialize max count
		
		int max =-1;
		char result = ' ';
		
		
		//traversing through the string and maintian the count of each character
		for(int i=0; i<len;i++) {
			if(max<count[str.charAt(i)]) {
				max=count[str.charAt(i)];
				result=str.charAt(i);
			}
		}
		
		return result;
	}

}
