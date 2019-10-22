//inputting a string with multiple words with spaces, this program splits each word at a space and returns the length of the last word

public class LastWordValue {
	
	String word;
	
	public LastWordValue(String word)
	{
		this.word= word;
	}

	public int Value()
	{
		String [] wordspace = word.split(" ");// splits word at white space and places them in an  array
		String a=  (wordspace [wordspace.length-1]) ;// this is the last element in the split array
		
		for(int i= 0; i<wordspace.length;i++)
			{
			return a.length();
			}
			return -1;
	}
}
