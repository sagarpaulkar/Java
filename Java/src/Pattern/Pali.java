package Pattern;

public class Pali {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String Ori="SAGAS";
		
		String Rev="";
		
		for (int i=Ori.length()-1;i>=0;i--) {
			
			Rev=Rev+Ori.charAt(i);
		}
		
		System.out.println(Rev);
		
		if(Ori.contains(Rev)) {
			System.out.println("Palidrome");
		}
		else {
			System.out.println("Not Palidrome");
		}

	
}
}
