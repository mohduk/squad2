package LoopsEx;

import java.util.Random;

public class Student 
{

	public static void main(String[] args) 
	{
		Random rNum = new Random();
		int k=rNum.nextInt(100);
		
		for(int i=1;i<=50;i++)
		{
			System.out.print("Student Roll No.: "+i);
			System.out.print("\tPercentage: "+k);
			System.out.println();
			System.out.println("--------------------------------------------------");
			
			int h=i;
			if(h>i)
			{
				h=i;
			}
		}
	
	}
}
