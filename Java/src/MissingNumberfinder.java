import java.util.Arrays;

public class MissingNumberfinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] number= {1,2,3,4,5,7,8,9,10};
		
		int sum=0;
		
		int sume=0;
		
		for (int i=0; i<number.length;i++) {
			
			sum= sum + number[i];
			
		}
		
		for (int j=1;j<=10; j++) {
			
			sume=sume+j;
		}
		System.out.println(Arrays.toString(number));
		System.out.println("expected missing number:"+(sume-sum));
		
	}

}
