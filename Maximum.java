import java.util.Scanner;
class max
{
	int num1,num2,max;
	max()
	{		
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter two number ");
	        num1 = sc.nextInt();
	        num2 = sc.nextInt();
	}
	public void maxnum()
	{
		
		max= num1 > num2 ? num1:num2;
		System.out.println("maximum number between " + num1 +  " and " + num2 + " is " + max + ". ");
	}
	
}
public class Maximum {

	public static void main(String[] args) {
		 max obj=new max();
		 obj.maxnum();
		 

	}

}
