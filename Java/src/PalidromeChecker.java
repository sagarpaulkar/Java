
public class PalidromeChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="niasain";
		boolean result = ispalidrome(str);
		
		System.out.println(str +":" +"ispalidrome"+ ":"+ result);
	}

	private static boolean ispalidrome(String str) {
		// TODO Auto-generated method stub
	
	if (str==null) {
			return false;
		}
		if (str.length()<=1) {
			return true;
		}
		
		String first= str.substring(0,1);
		
		String last= str.substring(str.length()-1, str.length());
		
		if (!first.equals(last)) {
			return false;
		}
		else {
			return ispalidrome(str.substring(1, str.length()-1));
		}
		
	}
}
	
