
public class ReverseNumber {
	public static int reverseNumber(int num) {
		
		
		int result =0;
		
		while (num>0) {
			
			result = result*10+num%10;
			num=num/10;
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(reverseNumber(1234));
		
	}

}
