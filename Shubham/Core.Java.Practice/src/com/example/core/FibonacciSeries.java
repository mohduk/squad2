package com.example.core;

public class FibonacciSeries {
	
	public void getFibonacciNUmber() {
		int n=0;
		int m=1;
		System.out.println(n);
		System.out.println(m);
		for(int i=0;i<10;i++) {
			
			int temp=n+m;
			System.out.println(temp);
			n=m;
			m=temp;
		}
	}

}
