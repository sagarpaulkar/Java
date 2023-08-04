
public class Puctuation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int countPuctMarks = 0;
		
		String str= "Good Morning! Mr. James Potter. Had your breakfast?";
		
		
		for (int i=0;i<str.length();i++) {
			
			if (str.charAt(i)=='?'|| str.charAt(i)=='!') {
				
			countPuctMarks++;
		}
	}
System.out.println("Total Puct:"+countPuctMarks);
}
}

