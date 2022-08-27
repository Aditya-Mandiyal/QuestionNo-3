package com.godigit.component;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/*here we use @component annotation.
It allows Spring to automatically detect our custom beans.
*/

@Component
public class Student {
	/*
	 * Here we use @Value Annotation. It is use for assign values to variables and
	 * method.
	 */
    @Value("Aditya Mandiyal")
	private String name;
    @Value("98")
	private int rollNo;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public Student(String name, int rollNo) {
		super();
		this.name = name;
		this.rollNo = rollNo;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNo=" + rollNo + "]";
	}
	
}
