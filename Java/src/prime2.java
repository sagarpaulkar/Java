
public class prime2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num= 12;
		int a=0;
		for(int i=2;i<=num-1;i++) {
			
			if(num%2==0) {
				
				a=a+1;
			}
		}
		if (a==0) {
			
			System.out.println("prime"+num);
		}
		else {
			System.out.println("not prime " + num);
		}
	}

}
