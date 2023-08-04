import java.util.Scanner;

public class Cal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("First Num:");
		
		int num1 = sc.nextInt();
		
		System.out.println("Second Num");
		
		int num2 = sc.nextInt();
		
		
		System.out.println("Enter required operator [+,-,*,/]:");
		
		char operator= sc.next().charAt(0);
		
		if (operator =='+' || operator =='-' || operator =='*'||operator =='/')
				{
				int res= calculate(num1, num2, operator);
		
		System.out.println(res);
				}
		
		else {
			
			System.out.println("invalid");
			
		}
		
				
		sc.close();
		
	}
	
	static int calculate ( int x, int y , char operator ){
		
		int res=0;
		
		switch(operator)
		{
		case '+':
			res=x+y;
			break;
			
		case '-':
			res=x-y;
			break;
			
		case '*':
			res=x*y;
			break;
			
		case '/':
			res=x/y;
			break;
			
		
		}
		
		return res;
		
		
		
		
	}

}


