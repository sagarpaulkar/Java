
public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String S[]= "Sagar Kalidas Paulkar".split(" ");
		
		
		for (int i= S.length-1;i>=0;i--) {
			
			System.out.print(S[i]);
			System.out.print("\t");
		}
	}

}
