package com.example.demo;

public class Var {
		public int x =10;//instance var
		static int y=10;//static var
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Var v =new Var();
		int z =10;//local var
		int a=z+y+v.x;
		System.out.println("Addition:"+a);
		int b= z*y*v.x;
		System.out.println("multiplication:"+b);
	}

}
