//returns the value of roman numerals to numbers using Hashmap
import java.util.HashMap;


public class Roman2Int {

	public String s = " ";
	
	Roman2Int(String s)
	{
		this.s =s ;
	}
	
	public int RomanIntoInt(String s)
	{
	
		HashMap<Character,Integer> value =new HashMap<> ();
		value.put('I', 1);
		value.put('V', 5);
		value.put('X', 10);
		value.put('L', 50);
		value.put('C', 100);
		value.put('D', 500);
		value.put('M', 1000);
		
	
		int val1=0,val2=0;
	int sum=0;
		for(int i=0; i<s.length(); i++)
		{
			val1= value.get(s.charAt(i));
		if(i+1<s.length())
		{
			val2=value.get(s.charAt(i+1));
		}
		else
		{
			val2=0;
		}
		
		if(val1>=val2)
			{
				sum = val1+val2;
			}
			else
			{
				sum = sum +(val2-val1);
				i++;
			}
		
		
		}return sum;
	}
	
}
