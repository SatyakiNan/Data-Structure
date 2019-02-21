package data;

public class Interview8 {

	boolean isRotation(String s1, String s2) {
	        if (s1 == null || s2 == null) 
	        	return false;
	        if (s1.length() != s2.length()) 
	        	return false;
	            
	            return isSubstring(s1 + s1, s2);
	    }

	    private boolean isSubstring(String s1, String s2) {
	        return s1.contains(s2);
	    }
	    
	    
	    public static void main(String args[]) {
	    	
	    	Interview8 obj = new Interview8(); 
	        String input = "waterbottle"; 
	        String input1 = "erbottlewat";
	        
	        if(obj.isRotation(input, input1))
	        	 System.out.println("The String " + input + " this one " + input1);
	        else
	        	System.out.println("The String " + input + "not this one");
	        	
	    }
	}

