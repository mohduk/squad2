package com.examples.variable;

public class Program {

	public static void main(String[] args) {
		
		var a = 10;
		
		//System.out.println(a);
		
		Bike bike = new Bike();
		bike.WhoIAm();
		bike.GetStart();
		System.out.println(Bike.Color);
		
		bike.SetColor();
		System.out.println(Bike.Color);
		
//		IEngine pulsar = new Bike();
//		pulsar.SetColor(); 
//		System.out.println(Bike.Color);
//		System.out.print("Pulsar : ");
//		
//		pulsar.GetStart();
//		 
	
		
		// Statick variable do not required instance of Class
		System.out.println(Student.staticToClass);
		
		Student student = new Student();
		System.out.println(student.staticToClass);
		System.out.println(student.localToClass);
		student.Display();
		System.out.println(student.getValue());
		


	}

}
