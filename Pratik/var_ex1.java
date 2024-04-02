package examples;
public class var_ex1 {
	int a=10;//instance
	static int b=20;//static
	public static void main(String []args) {
		int c =30;//local
		var_ex1 v=new var_ex1();
		System.out.println("this is local var:-" +c);
		System.out.println("this is static var:-" +b);
		System.out.println("this is instance var:-" +v.a);
		
	}

}
