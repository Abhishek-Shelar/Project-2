package User_define_constructor;

public class Example5
{
	//user define constuctor
	//veriable decleration
	int num1;
	int num2;
	//veriable initionalize
	Example5()    // user define consture
	{
		num1=10;
		num2=25;
		
		
	}
	//condition
	public void addition()   //non static regular method ---->(condition1)
	{
		System.out.println(num1+num2);
		
	}
	public void mutiplication()
	{
		System.out.println(num1*num2);
		
	}
	//veriable usese
	public static void main(String[] args)    //non-Static regular method from same class
	{
		Example5 A1=new Example5();
		A1.addition();
		System.out.println("--------------------");
   //Example5 A2=new Example5();
   A1.mutiplication();
   System.out.println("---------------------------");
   //non-Static regular method from difrent class
   Example2 A3=new Example2();
   A3.muliplication();
   
	}

}
