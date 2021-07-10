import java.util.Scanner;
public class FibonacciSeries 
{
	public static void main(String[] args) 
	{
		Scanner Scanner = new Scanner(System.in);
		System.out.println("Enter The Number To Find Fibonacci Series");
		int previousNumber = 0 ;
		int currentNumber = 1 ;
		int fibonacciNumber = Scanner.nextInt();
		System.out.print(previousNumber+","+currentNumber);
		int nextNumber;
		for (int i =0; i < fibonacciNumber - 2; i++ ) 
		{
			nextNumber = previousNumber + currentNumber;
			previousNumber = currentNumber;
			currentNumber = nextNumber;
			System.out.print(","+nextNumber);
		}
	}

}