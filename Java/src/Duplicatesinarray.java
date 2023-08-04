import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Duplicatesinarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr= {2,5,6,7,6,9,10,9,2};
		
		Duplicatesinarray.findelementUsingbrutforce(arr);
		Duplicatesinarray.findelementUsingsorting(arr);
		Duplicatesinarray.findelementUsingset(arr);
		Duplicatesinarray.findelementUsingMap(arr);
	}

	
	private static void findelementUsingbrutforce(int [] arr) {
		
		for(int i=0;i<arr.length;i++) {
			
			for (int j=i+1;j<arr.length;j++) {
				
				if (arr[i]==arr[j]) {
					System.out.println("Duplicates number :"+arr[i]);
				}
			}
		}
		
	}
	private static void findelementUsingsorting(int [] arr) {
		
		Arrays.sort(arr);
		for (int i=0;i<arr.length-1;i++ ) {
			
			if(arr[i]==arr[i+1]) {
				
				System.out.println("Duplicate Element is:"+arr[i]);
			}
			
		}
	}
		
		
		private static void findelementUsingset(int [] arr) {
			Set<Integer> hs= new HashSet<Integer>();
			
			for (int x :arr) {
				
				if(!hs.add(x))
				{
					System.out.println("Duplicates:"+x);
				}
				
			}
			
				
			}
			private static void findelementUsingMap(int [] arr) {
			
				Map<Integer, Integer> hm= new HashMap<Integer,Integer>();
				
				for(int x:arr) {
					
					if(!hm.containsKey(x)) {
						hm.put(x,1);
						
					}else {
						hm.put(x,hm.get(x)+1);
					}
				}
				for (int x: hm.keySet()) {
					
					if(hm.get(x)>1) {
						System.out.println("Duplicates ="+x);
					}
				}
	}
}
