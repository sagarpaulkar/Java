
public class rotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		String str1="ABCDE", str2="DEABC";
 
		if(str1.length()!=str2.length()) {
			
			System.out.println("Not Rotation");
			
		}
		
		else {
			
			str1=str1.concat(str1);
			
		if (str1.indexOf(str2)!=-1)
			
			System.out.println("rotation");
		else 
			System.out.println("not rotation");
		}
		
	}

}
