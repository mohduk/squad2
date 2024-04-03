package LoopsEx;

class Student2 
{
	int rollNumber ;
	String name;
	
	Student2(int r, String n)
	{
		rollNumber=r;
		name=n;
	}
	
	void Display()
	{
		System.out.println(rollNumber);
		System.out.println(name);
	}
	
	public static void main(String[] args) 
	{
		Student2 student1= new Student2(1,"Ashish");

		Student2 student2= new Student2(2,"Ani;");
		student2.Display();
		student1.Display();
		Student2 student3= new Student2(3,"pratik");
		student3.Display();
		
	}
}
