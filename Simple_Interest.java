import java.util.Scanner;
class si{
	double p,r,t;
	void insert()
	{
	 Scanner sc = new Scanner(System.in);
     System.out.println("Enter the Principal: ");
     p = sc.nextDouble();
     System.out.println("Enter The Rate: ");
     r = sc.nextDouble();
     System.out.println("Enter the Time: ");
     t = sc.nextDouble();
	}
	void calculate(){
		System.out.println("Simple interest = "+(p*r*t)/100);
		
	}
}
public class Simple_Interest 
{
	public static void main(String[] args) 
	{
		si obj=new si();
		obj.insert();
		obj.calculate();
		
		
		

	}

}
