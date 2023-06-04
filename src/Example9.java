
public class Example9 
{
	//User define constructor
	//veriable declation
	
	int num1;
	int num2;
	
//veriable initialization
	Example9(int a, int b)
	{
		num1=a;
		num2=b;
		
		
	}
	//condition
	public void Addition()    //non static regular method
	{
		System.out.println(num1+num2);
		
	}
//main method
	public static void main(String[] args)
	{
		//from same class
		System.out.println("--------------------------------");
     Example9 A11=new Example9(25,35);
     A11.Addition();
     //from diffrent class
     System.out.println("---------------------------");
     Example10 A1=new Example10();
     A1.m1();
     System.out.println("----------------------------------");
     System.out.println(20);
     
		
	}
}
