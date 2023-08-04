
public class SLword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

    String line = "Hardships often";
    SL(line);		
		}
 public static void SL(String line ) {
	 
	 String word ="", small="", large="";
	 
	 String[] words = new String[100];  
	 
     int length = 0; 
     
    line = line + " ";
    
    for (int i=0; i<line.length();i++ ) {
    	
    	if ( line.charAt(i)!=' ') {
    		
    		word = word + line.charAt(i);
    	}
    	
    	else 
    	{
    		words[length]=word;
    		length++;
    		word="";
    	}
    }
    
    small=large=words[0];
    
    for (int k=0; k< length; k++) {
    	
    if (small.length()> words[k].length())
    	small= words[k];
    
    if(large.length()< words[k].length())
    	
    	large=words[k];    	
    }    
    System.out.println("Smallest word: " + small);  
    System.out.println("Largest word: " + large);  	 
 }
}
