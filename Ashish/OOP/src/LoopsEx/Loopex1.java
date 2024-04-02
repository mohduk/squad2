package LoopsEx;

public class Loopex1 
{
	public void  ForEx()
	{
	System.out.println("Table of 28");
		
		int j=28;
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(j*i);
		}
		
	}
	
	public void WhileEx()
	{
		System.out.println("Table of 21");
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
		System.out.println("Table of 20");
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
		System.out.println("Pattern:");
		for(int i=0; i<=5;i++)
		{
			for(int j=i;j>=1;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) 
	{
		Loopex1 l= new Loopex1();
		
		l.ForEx();
		l.WhileEx();
		l.DoWhileEx();
		l.NestLoop();
	}
}
