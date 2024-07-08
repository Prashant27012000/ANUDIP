
import java.util.Scanner;

class bank1 
{
    double amount;
    bank1(double am)
    {
        amount=am;
    }
    public void deposit(double depositAmount)
    {
       
        amount = amount + depositAmount;
        System.out.println("Deposit Successful ");
        System.out.println("Balance :" + amount);
    }
    public void withDraw(double withdrawalAmount)
    {
        String result = (amount>withdrawalAmount) ? "True" : "False";
        if (result=="True")
       
        {
            amount = amount-withdrawalAmount;
            System.out.println("WithDrawl successful");
            System.out.println("Balance:" + amount );
        }
        else 
        {
            System.out.println("You Don't have enough balance in your account");
        }
        
    }
}
public class Bank 
{
    public static void main(String[] args)
    {
    	Scanner sc = new Scanner(System.in);
    	bank1 objbank1 = new bank1(10000);
    	System.out.println("Enter the Withdraw amount ");
        double withdrawAmount = sc.nextDouble();
        objbank1.withDraw(withdrawAmount);
        objbank1.deposit(5000);
    }
}
