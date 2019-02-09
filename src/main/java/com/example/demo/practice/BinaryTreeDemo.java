package com.example.demo.practice;

public class BinaryTreeDemo {
    Node root;
   
    BinaryTreeDemo(int key)
    {
        root = new Node(key);
    }
 
    BinaryTreeDemo()
    {
        root = null;
    }
  
	public static void main(String[] args) {
		   BinaryTreeDemo tree = new BinaryTreeDemo();
		 
	        /*create root*/
	        tree.root = new Node(1);
	 
	        /* following is the tree after above statement
	 
	              1
	            /   \
	          null  null     */
	 
	        tree.root.left = new Node(2);
	        tree.root.right = new Node(3);
	 
	        /* 2 and 3 become left and right children of 1
	               1
	             /   \
	            2      3
	          /    \    /  \
	        null null null null  */
	 
	 
	        tree.root.left.left = new Node(4);
	        tree.root.left.right =new Node(5);
	        
	        /* 4 and 5 become left and right children of 2
            			    1
           				  /   \
         				 2      3
       					/ \    /  \
     					4 5   null  */

	        
	        

	}

}
  

class Node {
	int key;
	Node right, left;
	
	Node(int item){
		key=item;
		right=left=null;
	}
}