package User_define_constructor;

public class Example11 
{
	//user define constructor
	//veriable decleration
	int num1;
	int num2;
	int num3;
	int num4;
	String e;
	
	//veriable initialisation
	Example11(int a,int b, int c,int d)
	{
		num1=a;
		num2=b;
		num3=c;
		num4=d;
		
	}
	//condition
	public void addition()
	{
		System.out.println(num1+num2+num3+num4);
	}
	public static void main(String[] args) {
		Example11 A=new Example11(11,22,33,44);
		A.addition();
	}
		
	}
