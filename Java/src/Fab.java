import java.util.Scanner;

public class Fab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner (System.in);
		
		System.out.println("Fabinoccai series: ");
		
		int number = sc.nextInt();
displayFab(number);
		sc.close();
	}
	
	static void displayFab(int n) {
		int x=1, y=0, z=0, count=1; 
		while (count <=n) {
			System.out.println(z+"  ");
			z=x+y;
			x=y;
			y=z;
			count++;
					}
	}
}