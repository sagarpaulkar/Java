import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicateWordsRemoval {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str= "I am am rahul rahul";
		
		String [] arr= str.split(" ");
		
		Set <String> actual= new LinkedHashSet<String>();
		
		for (String x: arr) {
			
			
			actual.add(x);
		}
		
		Iterator itr= actual.iterator();
		
		while (itr.hasNext()){
			
			System.out.println(itr.next()+" ");
		}
	}

}
