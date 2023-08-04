
public class ReverseEachWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "We are learning Java";
		String result="";
		String[] arr= str.split(" ");
		
		
		for (String word:arr) {
			
			String revWord="";
			int j= word.length()-1;
			while (j>=0) {
				
				char ch= word.charAt(j);
				revWord= revWord+ch;
				j--;
			}
			result=result+revWord+" ";
		}
		System.out.println(result);
		
	}

}
