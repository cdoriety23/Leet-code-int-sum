public class LastWordValue {
	
	String word;
	
	public LastWordValue(String word)
	{
		this.word= word;
	}

	public int Value()
	{
		String [] wordspace = word.split(" ");// splits word at white space
		String a=  (wordspace [wordspace.length-1]) ;// this is the last last 			element in the split array
		
		for(int i= 0; i<wordspace.length;i++)
			{
			return a.length();
			}
			return -1;
	}
}
