package LoopsEx;

public class Loopex1 
{
	public void  ForEx()
	{
	System.out.println("Table of 28 using For Loop");
		
		int j=28;
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(j*i);
		}
		
	}
	
	public void WhileEx()
	{
		System.out.println("Table of 21 using While Loop");
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
		System.out.println("Table of 20 using Do While Loop");
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
		System.out.println("Pattern using Nested Loops:");
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
		System.out.println("Print a Number if Positve using If Statement");
		int a=10;
		if(a>0)
		{
			System.out.println(a+" is greater than 0.");
		}
			
	}
	
	public void IfElse()
	{
		System.out.println("Find a greater number useng If Else STatement");
		int a=20;
		int b=30;
		if(a>b)
		{
			System.out.println(a+" is greater than "+b);
		}
		else
		{
			System.out.println(b+" is greater than "+a);
		}
	}
	
	public void IfLad()
	{
		System.out.println("Find a size using If else Ladder");
		int s=30;
		if(s==30)
		{
			System.out.println(s+ "is small size");
		}
		if(s==36)
		{
			System.out.println(s+" is extr large size");
		}
		else 
		{
			System.out.println("Size not available");
		}
			
	}
	
	public void Switch()
	{
		System.out.println("Find size using Switch case");
		int s=36;
		switch(s)
		{
		case 30:
			System.out.println(s+" is small size");
			break;
			
		case 36:
			System.out.println(s+" is extr large size");
			break;
			
		default:
			System.out.println("Size not available");
			break;
		}
	}
	public static void main(String[] args) 
	{
		Loopex1 l= new Loopex1();
	
		l.ForEx();
		System.out.println("---------------------------------------------");
		l.WhileEx();
		System.out.println("---------------------------------------------");
		l.DoWhileEx();
		System.out.println("---------------------------------------------");
		l.NestLoop();
		System.out.println("---------------------------------------------");
		l.IfState();
		System.out.println("---------------------------------------------");
		l.IfElse();
		System.out.println("---------------------------------------------");
		l.IfLad();
		System.out.println("---------------------------------------------");
		l.Switch();
		}
}
