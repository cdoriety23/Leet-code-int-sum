// Balanced Strings are those who have equal quantity of 'L' and 'R' characters
// returns the numbers of substrings in the string

public class BalancedString{
	
	public static void main(String args[])
	{
		String a = "RLRLLRLRLR"; // return 5;
		String b= "RLLLLRRRLR"; // return 3;
		System.out.println(balancedStringSplit(a));
		System.out.println(balancedStringSplit(b));
	}
	
	static int balancedStringSplit(String s) {
	      int countR=0;
	        int countL=0;
	       int  mainCount=0;
	        char [] word = s.toCharArray();// puts string in a character array
	        
	        for(int i=0; i<word.length; i++)
	        {
	            if(word[i]=='R')// the letter is R increment the counter R 
	            {
	                countR++;
	            }
	            else
	            {
	                countL++; 
	            }
	            
	            if(countL==countR)
	            {
	                mainCount++;
	                countR=0;
	                countL=0;
	            }
	        }return mainCount;
	        
	        
	    }
	}

