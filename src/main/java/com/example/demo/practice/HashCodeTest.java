/**
 * 
 */
package com.example.demo.practice;

public class HashCodeTest {

	public static void main(String[] args) {
	
		Employee employee=new Employee(2);
		Employee employee1=new Employee(2);
		System.out.println(employee==employee1);
		System.out.println(employee.equals(employee1));
		System.out.println(employee.hashCode());
		System.out.println(employee1.hashCode());
		

	}

}

 class Employee {
	int id;
	public Employee(int id) {
		this.id=id;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	
}