import java.util.Scanner;
public class Calculate_Time 
{
	
	 public static void main(String[] args)
	    {
		    Time obj1=new Time();
		    obj1.initialize();
	        obj1.timeCalculation();
	    }
    }
	      
class Time
{
    double speed,distance;
    public void initialize()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Speed: ");
        speed = sc.nextDouble();
        System.out.println("Enter The Distance: ");
        distance = sc.nextDouble();
       

    }
    public void timeCalculation()
    {
	        System.out.println("time taken"+(distance/speed)+"hours");
    }	
}

