
public class example3
{
	//default constructor
	//veriable decleration
	int num1;
	int num2;
//veriable initilisation
example3()
{
	num1=10;
	num2=30;
	
	}
//condition
public void addition()
{
	System.out.println(num1+num2);
	
}
public static void main(String[] args) {
	example3 A=new example3();
	A.addition();
	System.out.println(A.num1);
}
}
