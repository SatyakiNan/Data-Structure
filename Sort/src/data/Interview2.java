package data; 

public class Interview2{ 
    boolean uniqueCharacters(String str) 
    { 
       
        for (int i = 0; i < str.length(); i++) 
            for (int j = i + 1; j < str.length(); j++) 
                if (str.charAt(i) == str.charAt(j)) 
                    return false; 
  
      
        return true; 
    } 
  
    public static void main(String args[]) 
    { 
    	Interview2 obj = new Interview2(); 
        String input = "GeeksforGeeks"; 
  
        if (obj.uniqueCharacters(input)) 
            System.out.println("The String " + input + " has all unique characters"); 
        else
            System.out.println("The String " + input + " has duplicate characters"); 
    } 
}