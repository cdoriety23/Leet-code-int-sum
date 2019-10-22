import java.util.LinkedList;

// this class will return true or false if the string entered is a palindrome(meaning it is the same read from front or back)
public class PalindromeString {

	
	public static void  main(String args[])
	{
		
		String a= "aba";//true
		String b = "race a car";// false
		String c = "i did did i";//true
		String d = "true";//false
		String e = "false";// false
		
		System.out.println(checkForPalindrome(a));
		System.out.println(checkForPalindrome(b));
		System.out.println(checkForPalindrome(c));
		System.out.println(checkForPalindrome(d));
		System.out.println(checkForPalindrome(e));
		
		
	}
		public static boolean checkForPalindrome(String s)
		{
			LinkedList<Character> stack = new LinkedList<Character>();
			StringBuilder original = new StringBuilder(s.length());// creates an original object for the string input
			
			for(int i = 0; i<s.length(); i++)
			{
				char letter= s.charAt(i); //each letter is a character in the original "string"
				
				if((letter>='a' && letter <='z'))
				{
				original.append(letter);// creating a string by adding characters
				stack.push(letter);// pushing all letters to stack
				}
			}
			StringBuilder reverse = new StringBuilder(stack.size());// reverse string of the size of the stack
			while( !stack.isEmpty())// if stack isnt empty
			{
				reverse.append(stack.pop());
			}
		
			return(original.toString()).equals(reverse.toString());// using .equals to compare strings
			
				
				
		
		}
}
