package com.example.demo;
import java.util.Random;
public class loops2 {

	public static void main(String[] args) {
		int i;
		for(i=1;i<=50;i++) 
		{
			Random randomNum=new Random();
			int j=randomNum.nextInt(100);
			System.out.println("Student "+ i +"="+j);
		}
		int j;
		switch(j)
		{
		case 1:
			System.out.println("student "+i+j);
		}
	}

}
