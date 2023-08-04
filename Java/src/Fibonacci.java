
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int first =0;
		int second = 1;
	    int n=20;
	    
	    for (int i =1; i<=n;i++) {
	    	
	    	System.out.print(first+" ");
	    	int third = first+second;
	    	first=second;
	    	second=third;
	    	
	    }
	}

}
