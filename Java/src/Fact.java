import java.util.Scanner;

public class Fact {

	
	public static void main (String []  args) {
		
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the number : ");
		
		int number = sc.nextInt();
		
		Fact f = new Fact();
		
		int fact= f.factorial(number);
		System.out.println("Factorial of " + number+":"+fact);
		
	}
	
	int factorial (int n)	{
	
		
		int fact = 1;
		for( int i = 1; i<=n; i++)
		{
			
			fact *= i;
			
		}
		
	return fact;
		
	}
}
