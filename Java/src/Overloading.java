
public class Overloading {

	
	public static void display (int a) {
		
		System.out.println("I m good ");
		
	}
	
	public static void display(int a, String a1 ) {
		
		System.out.println("I m better");
	}
	
	
	public static void main (String [] args) {
		
		display(1, "Sagar");
	}
}
