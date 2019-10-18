// find the fibannoci of the number using recurssion 
public class Fibannoci {
	public static void main(String args[])
	{
		System.out.println(fib(7));// 13
		System.out.println(fib(9));//34
	}
		
			public static int fib(int num)
			{
				if(num<=1)
				{
					return num;
				}
				return fib(num-1) +fib(num-2);
			
			}
		
		}
		
	