package User_define_constructor;

public class Example9 {

	
	//veriable initinal Declearation 
	int num1;
	int num2;
	// veriable initinalization
Example9(int a,int b)
	{
	
	num1=a;
	num2=b;
	
	}
	//condition
	public void addition()
	{
	System.out.println(num1+num2);
	}
	//main method
	public static void main(String[]arg)
	{
	Example9 A1=new Example9(10,15);
	A1.addition();
	}
	}

