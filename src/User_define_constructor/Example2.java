package User_define_constructor;

public class Example2 
{
	//user define variable
	//variable declration
	
	int num1;
	int num2;
	//variable initialized  constuctor
	Example2()
	{
		num1=20;
		num2=30;
	}
	//veriable uses
public  void Addition()     //non Stastic regular method
	{
		System.out.println(num1+num2);


	}

public  void muliplication()
{
	System.out.println(num1*num2);
	
}
public static void main(String[] args)        //non-static regular method (user-define constructor)
{
	Example2 E2=new Example2();
	E2.Addition();
	System.out.println("--------------------");
	
	Example2 E3=new Example2();
	E3.muliplication();
	System.out.println("--------");
	// non-stastic user define method
	Example1 E5=new Example1();
	E5.addition();
}
	

}
