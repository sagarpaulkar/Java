
public class Factorial {
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=5;

		fact(n);
		System.out.println("The Factorial of "+n+" is "+recurssion(n));
		
	}
	public static void fact(int n) {
		int fact=1;
		
		for (int i=1;i<=n;i++) {
			
			fact=fact*i;
			
		}
		
		System.out.println("The Factorial of "+n+" is "+fact);
		
	}
	
	public static int recurssion(int n) {
		
		if(n<=1)
		return 1;
		else 
			return n*recurssion(n-1);
	}
	
	}

	

