package com.example.demo;
import java.util.Random;

public class Loop1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//for loop
		System.out.println("for loop");
		int i;
		int j;
		for(i=1 ; i<=50; i++) {
			 Random r = new Random();
			 j = r.nextInt(100);
			System.out.println("student "+ i+" is "+j);
		}
		
		}
}
//		 int a;
//		 for(a=1;a<=50;a++) {
//			  i = rand.nextInt(50);
//			 System.out.println("Random Integers for:"+i );
		// }
//		 for()
//		 int j = rand.nextInt(50);
//		 System.out.println("Random Integers: "+j);
//		//if 
//		System.out.println("if loop");
//		int j = 10;
//		if(j ==10) {
//			System.out.println("j i= 10");
//		}
//		System.out.println("ifelse loop");
//		int k=10;
//		if(k==10) {
//			System.out.println("k=10");
//		}
//		else{
//			System.out.println("k is not 10");
//		}
//		System.out.println("do while loop");
//		do {
//			i++
//			
//		}
	


