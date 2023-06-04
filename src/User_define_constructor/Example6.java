package User_define_constructor;
// user define method with parameter

public class Example6 
{
	//veriable decleration
	int num1;
	int num2;
	// veriable initionalization
	Example6(int a, int b)      //user define constructor from same class
	{
		num1 =a;
		num2 =b;
	}
	//condtion
	public  void addition()

	{
		System.out.println(num1+num2);
		
	}
	//condition 2
   public void multi()
   {
	   System.out.println(num1*num2);
	
}
   public static void main(String[] args)
   {
	   Example6 A1=new Example6(10,20);
	   A1.addition();
	   A1.multi();
	   System.out.println("----------------------------");
	
}
          
}
