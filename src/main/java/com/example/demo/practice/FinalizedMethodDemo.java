package com.example.demo.practice;

public class FinalizedMethodDemo {
	
	public static void main(String[] args) {
		FinalizedMethodDemo fd=new FinalizedMethodDemo();
		System.out.println(fd.hashCode());
		fd=null;
		
		System.gc();
		
		System.out.println("end");
	}

	
	
	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		System.out.println("called finalized.");
	}
}
