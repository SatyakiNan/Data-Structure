package data;
import java.util.*; 

public class Interview1 {
	
	/* Convert the string to character array 
	       for sorting */
	    boolean uniqueCharacters(String str) 
	    { 
	        char[] chArray = str.toCharArray(); 
	  
	        // Using sorting 
	        // Arrays.sort() uses binarySort in the background 
	        // for non-primitives which is of O(nlogn) time complexity 
	        Arrays.sort(chArray); 
	  
	        for (int i = 0; i < chArray.length - 1; i++) { 
	            // if the adjacent elements are not 
	            // equal, move to next element 
	            if (chArray[i] != chArray[i + 1]) 
	                continue; 
	  
	            // if at any time, 2 adjacent elements 
	            // become equal, return false 
	            else
	                return false; 
	        } 
	        return true; 
	    } 
	  
	    // Driver code 
	    public static void main(String args[]) 
	    { 
	    	Interview1 obj = new Interview1(); 
	         String input = "OMARI"; 
	  
	        if (obj.uniqueCharacters(input)) 
	            System.out.println("The String " + input 
	              + " has all unique characters"); 
	        else
	            System.out.println("The String " + input 
	           + " has duplicate characters"); 
	    } 
	} 

