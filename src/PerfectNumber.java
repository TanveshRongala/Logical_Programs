import java.util.Scanner;
public class PerfectNumber 
{
	public static void main(String[] args) 
	{
		int Number,sum=0;
 	    Scanner scan = new Scanner(System.in);	   	 
 	    System.out.println("Enter a number");
 	    Number = scan.nextInt();
 	    int i=1;
 	    while(i <= Number / 2)
 	    {
 	    	if(Number%i==0)
 	    	{
 	    		sum += i;
 	    	}
 	    	i++;
 	    }
 	    	if(sum == Number)
 	    	{
 	    		System.out.println(Number+" is a perfect number");
 	    		//int number;
 	    		//number = sum + i ;
 	    		System.out.println(""+(i-1));
 	    		System.out.println(""+(i-2));
 	    		System.out.println(""+(i-3));
 	    	} 
 	    		else
 	    			System.out.println(Number+" is not a  perfect number");
	}
}