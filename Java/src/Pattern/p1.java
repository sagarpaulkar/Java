package Pattern;

public class p1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String Original="abcdef";
		String reverse="";
		
		System.out.println(Original.length());
		
		for (int i=Original.length()-1;i>=0;i--)
		{
			reverse=reverse+Original.charAt(i);
		}
		
		System.out.println("The Reverse String is "+ reverse);

		if(Original.equals(reverse)) {
			System.out.println("The entered String is Palindrome");
		}else {
			System.out.println("The entered String is not Palindrome");
		}
}
	}

	
