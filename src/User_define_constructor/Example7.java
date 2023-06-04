package User_define_constructor;

public class Example7
{
	//user define constructor from same class/diffrent class
	// veriable decleration
	int num1;
	int num2;
	String a;
	
	//verible intialization
	Example7(int a, int b)
	{
		num1=a;
		num2=b;
		
	}
	
	Example7(String c)
	{
		a=c;
		
	}
// condtion
	public void addition()   //non-static regular method
	{
		System.out.println(num1+num2);
		
	}
	//condition 2nd 
	public  void multi()  //non-static regular method
	{
		System.out.println(num1*num2);
	}
	public  void m1()
	{
		System.out.println(a);
	}
	//main method
	public static void main(String[] args) 
	{
		Example7 A1=new Example7(10,15);
		A1.addition();
		System.out.println("-------------------");
		A1.multi();
		//user define constructor from diff class
		System.out.println("---------------------");
		Example8 A2=new Example8(15,10);
		A2.substrction();
		
		
		Example7 A3=new Example7("Abhishek");
		A3.m1();
		
		
	}
}
