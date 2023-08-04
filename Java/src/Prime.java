import java.util.Scanner;

public class Prime {
	
	public static void main( String [] args) {
		
	Scanner sc= new Scanner (System.in);
	
	System.out.println("Enter any number:");
	
	int number = sc.nextInt();
	
	boolean isPrime= false; 
	
	for ( int i=2; i<number;i++) {
		
		if (number % i == 0)
			
		{
			
			isPrime = false;
			break;
			
			}else 
			{
				isPrime = true;
				
			}
		
		}
	if (isPrime) {
		
		System.out.println(number +"prime number");
	}else 
	{
		System.out.println(number + "not prime");
		
	}
	
	
}
}
