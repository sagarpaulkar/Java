
public class ReverseWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str= "We are learning Java";
		String str2="";
		 String [] arr=str.split(" ");
		 
		 for (int i =arr.length-1;i>=0;i--) {
			 
			 str2=str2+arr[i]+" ";
			 
			 
		 }
		 System.out.print(str2);
	}

}
