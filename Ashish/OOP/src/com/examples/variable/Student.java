package com.examples.variable;

public class Student {
	
	public int localToClass = 10;
	public static int staticToClass = 100;
	
	// private to Class
	private int privateVariable = 20;
	
	public Student() {
		localToClass = 11;
	}
	
	
	public void Display() {
		var localToMethod = 12;
		System.out.println(localToClass);
	}
	
	public int getValue() {
		return  privateVariable;
	}
	
	public boolean getBolean() {
		return  true;
	}
}
