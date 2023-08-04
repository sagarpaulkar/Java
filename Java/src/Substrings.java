
public class Substrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		
	
		String str= "fun", sub;
		
		int i,j,length;
      
      length= str.length();
      
      
      System.out.println("Substrings of :"+ str + " are:");
      
      for (i=0;i<=length;i++) {
    	  
    	  for (j=1;j<=length-i;j++) {
    		  
    		  sub= str.substring(i,i+j);
    		  System.out.println(sub);
    	  }
      }
    	  
    	  
	}

}
