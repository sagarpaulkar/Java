import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Dup {  
		
		
		
	     public static void main(String[] args) {  
	        String string1 = "Great responsibility";  
	       // du(string1);
	        dup(string1);
	        
	     }
	     
	     public static void du(String string1) {
	    	 char [] string = string1.toCharArray();  
	         int count = 0;
	         
	         Map<Character, Integer> map= new LinkedHashMap<Character, Integer>();
	         
	         for (int i=0;i<string.length;i++) {
	        	 
	        	 for (int j=0;j<string.length; j++) {
	        		 
	        		 if (string[i]==string[j]) {
	        			 count++;
	        		 }
	        	 }
	        		 
	        		 if(count>1) {
	        			 
	        			 map.put(string[i],count);
	        		 }
	        		 count=0;
	        	 }
	        	 System.out.println(map);
	         }
	          
	     
	        
	        
	        public static void dup(String string1) {
	        	char string[] = string1.toCharArray();  
		          
	        int count;  
	          
	        //Converts given string into character array  
	        
	       System.out.println("Duplicate characters in a given string: ");  
	        //Counts each character present in the string  
	        
	        for (int i=0;i<string.length;i++) {
	        count =1;
	        
	        for (int j=i+1;j<string.length; j++) {
	        	
	        	if(string[i]==string[j] && string [i]!='0') {
	        		
	        		count++;
	        		
	        		string[j]='0';
	        	}
	        }
	       
	            //A character is considered as duplicate if count is greater than 1  
	            if(count>1 && string [i]!='0') {
	            	
	            	System.out.println(string[i]+"="+count);
	            }
	        }  
	    }  
	}  
