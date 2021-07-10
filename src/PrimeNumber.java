import java.util.Scanner;
public class PrimeNumber 
{
	public static void main(String[] args) 
	{
		Scanner Scan = new Scanner(System.in);
		System.out.println("Enter Any Number Check It's Prime Or Not : ");
		int num = Scan.nextInt();
	    boolean flag = false;
	    for (int i = 2; i <= num / 2; ++i) 
	    {
	      // condition for non prime number
	      if (num % i == 0) 
	      {
	        flag = true;
	        break;
	      }
	    }

	    if (!flag)
	      System.out.println(num + " is a prime number.");
	    else
	      System.out.println(num + " is not a prime number.");
	}
}