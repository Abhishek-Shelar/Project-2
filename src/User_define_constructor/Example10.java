package User_define_constructor;

public class Example10 
{
	//veriable decleration
	int num1;
	int num2;
	float num3;
	//int num4;
	


//veriable initialization
Example10(int a, int b,float c)
{
	num1=a;
	num2=b;
    num3=c;
}
public void avg() 
{
	System.out.println("avg"+" "+(num1+num2)/num3*100);
	
}
public static void main(String[] args) {
Example10 A=new Example10(40,50,50);
A.avg();
}
}
	
