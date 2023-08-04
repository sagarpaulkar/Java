
public class Pat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Triangle");
	inc();
		
		//dec();
		
		//instar();
	}
	
	
	public static void inc() {
		
		
		for (int i=1;i<=5;i++) {
			
			for (int j=1;j<=i;j++) {
				
			System.out.print(i);
		}
			System.out.println(" ");
	}
}
	
	public static void dec() {
		    
	        for (int i = 1; i <= 5; i++)   
	       {  
	         for (int j = 5 ; j >= i; j--) {  
	                       
	            System.out.print("*");  
	    }  
	         System.out.println(" ");
	       }
	}
	
	public static void instar() {
           for (int i=1;i<=5;i++) {
			
			for (int j=5;j>=1;j--) {
				
				if(i!=j) 
					System.out.print(j);
					else
			System.out.print("*");
		}
			System.out.println(" ");
	}
}
}
	
	




