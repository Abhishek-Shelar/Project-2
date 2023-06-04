package User_define_constructor;

public class Example4 
{
	//Veriable decleration
	int num1;
	int num2;
	int num3;
	//veriable identification
	Example4()     //user define constu
	{
		num1=30;
		num2=40;
		num3=50;
	}
//veriable use
	public  void addition()
	{
		System.out.println(num1+num2+num3);
		
	}
	public void multiplication()
	{
		System.out.println("multiplication"+" "+(num1*num2*+num3));
		
	}
	public static void main(String[] args)   //non-Static regular method from same class(user define method)
	{
		Example4 E1=new Example4();
		E1.addition();
		System.out.println("------------------------------");
		Example4 E2=new Example4();
		E2.multiplication();
		System.out.println("-------------------");
		//non-Stastic regular method from different  class (user define method)
		Example2 E3=new Example2();
		E3.Addition();
	}
}
