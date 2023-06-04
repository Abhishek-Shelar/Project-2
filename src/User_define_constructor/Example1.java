package User_define_constructor;

public class Example1 
{
	//variable decleration----->   step1
int num1;
int num2;
//variable initialization-----Step2
Example1()
{
	num1=20;
	num2=30;
	}
//veriable uses
public void addition()
{
	System.out.println("Addition of two number"+" "+(num1+num2));


}

public static void main(String[] args)
{
  Example1 E1=new Example1();
  E1.addition();
}

}
