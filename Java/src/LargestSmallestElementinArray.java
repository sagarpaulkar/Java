import java.util.Arrays;

public class LargestSmallestElementinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] arr = {5,6,3,9,-25,234,7,2};
		
		int large= arr[0];
		int small = arr[0];
		
		for (int i =1; i<arr.length;i++ ) 
		{
			
			if (arr[i]>large) 
			{
				large =arr[i];
			}
			else if	(arr[i]<small)
			{
					small=arr[i];
					
			}
		}
		
		System.out.println(Arrays.toString(arr));
		System.out.println("largest="+large);
		System.out.println("smallest="+small);

}
}