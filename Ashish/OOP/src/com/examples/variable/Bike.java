package com.examples.variable;

public class Bike implements IEngine, IPaint {

	public static String Color = "Black";
	
	@Override
	public void GetStart() 
	{
		System.out.println("Start");
	}

	@Override
	public void SetColor() {
		// TODO Auto-generated method stub
		Color = "Pink";
	}
	
	public void WhoIAm() {
		System.out.println("I am Bike");
	}
		
}
