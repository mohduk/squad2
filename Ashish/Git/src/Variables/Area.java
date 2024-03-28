package Variables;

public class Area 
{
	//Static variable
	static double p=3.14;
	
	//instance variable
	public int radius=5;

	
	public static void main(String[] args) 
	{
		//loacal variable
		double area;
		
		area=p*radius*radius;
		
		System.out.println("Area of circle with radius"+radius+": "+area);
	}
}
