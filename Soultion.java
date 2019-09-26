public class Soultion {

	public static void main(String args[])
	{
		int[] a = new int[] { 1,3,4,6,7,8,9,12,34,13};
		int [] b = a.clone();
		
		for(int i = 0; i<a.length; i++)
		{
			System.out.print( " "+ a[i] + " " + "\n");
		}
		
		for(int i = 0; i<b.length; i++)
		{
			System.out.print( " "+ b[i] + " " );
		}
	}
	
	
}