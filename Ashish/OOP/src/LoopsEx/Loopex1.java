package LoopsEx;

public class Loopex1 
{
	public void  ForEx()
	{
	System.out.println("Table of 28 using For");
		
		int j=28;
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(j*i);
		}
		
	}
	
	public void WhileEx()
	{
		System.out.println("Table of 21 usning While");
		int j=21;
		int i=1;
		while(i<11)
		{
			System.out.println(i*j);
			i++;
		}
	}
	
	public void DoWhileEx()
	{
		System.out.println("Table of 20 using DoWhile");
		int j=20;
		int i=1;
		do
		{
			System.out.println(i*j);
			i++;
		}while(i<11);
	}

	public void NestLoop()
	{
		System.out.println("Pattern using Nested loop:");
		for(int i=0; i<=5;i++)
		{
			for(int j=i;j>=1;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}	
	
	public void IfState()
	{
		int a=20;
		
		if(a>0)
		{
			System.out.println(a +" is positive Number");
		}
	}
	
	public void IfElse()
	{
		int a=20;
		int b=30;
		if(a>b)
		{
			System.out.println(a+" is graeter than "+b);
		}
		else
		{
			System.out.println(b+ " is greater than "+b);
		}
	}
	
	public void IfElseLad()
	{
		int a=71;
		if(a<100&a>70)
		{
			System.out.println("Distinction");
		}
		if(a<70&a>60)
		{
			System.out.println("First Class");
		}
		if(a<60&a>40)
		{
			System.out.println("PASS");
		}
		if(a<35)
		{
			System.out.println("FAIL");
		}
	
	}
	
	public void Switch()
	{
		int i= 36;
		switch(i)
		{
		case 30:
			System.out.println(i+ " is Small size");
			break;
			
		case 36:
			System.out.println(i+" is Extra large size");
			break;
			
		default:
			System.out.println(i);
			break;
		}
			
	}
	
	public static void main(String[] args) 
	{
		Loopex1 l= new Loopex1();
		
		l.ForEx();
		l.WhileEx();
		l.DoWhileEx();
		l.NestLoop();
		l.IfState();
		l.IfElse();
		l.IfElseLad();
		l.Switch();
	}
}
