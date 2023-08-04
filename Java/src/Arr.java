public class Arr {
public static void main(String[] args) {

	StringBuffer sb= new StringBuffer("Sagar");
	
	System.out.println(sb.reverse());
	
StringBuilder sb2= new StringBuilder("Paulkar");
	
	System.out.println(sb2.reverse());
	
	
	String s= "SAGAR";
	
	for (int i=s.length()-1;i>=0;i--) {
		
		System.out.print(s.charAt(i));
	
	}
	System.out.print("");
}
}
