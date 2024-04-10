/**
 * 
 */
package com.example.core;

/**
 * @author PRATIK
 *
 */
public class FibonacciSeries {
	
	public void getFibonacciNumber() {
		
		int n =0;
		int m =1;
		
		for(int i = 0; i < 10; i++)
			
		{
			System.out.println(n);
			System.out.println(m);
			// 0 1 1 2 3 5 8 
			int temp = n + m ; 
			
			System.out.println(temp);
			n = m;
			m = temp;
			
		}
	}

}
