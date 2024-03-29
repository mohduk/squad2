package Variable;

public class Circle 
{
	//Static Variable
	public static double p= 3.14;
	
	//Instance variable
	public int rad;
	
	//cunstructor
	public Circle()
	{
		this.rad=5;
	}
	public static void main(String[] args) 
	{
		Circle c= new Circle();
		//Local Variable
		double area;
		double circum;
		
		area=Circle.p*c.rad*c.rad;
		circum= 2*Circle.p*c.rad;
		
	}

}
