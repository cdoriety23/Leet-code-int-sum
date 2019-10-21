// robot unique path problem for leetcode

public class ShortestPath {
	
	public static void main(String args[])
	{
		System.out.println(uniquePaths(7,3));// 28
	
	
	
	}
	
	public static int uniquePaths(int m, int n)
	
	{
		int[][] sp=new int[m][n];
		{
		if (m<=1 || n<=1) return 1;
		}
		
		for (int i=0;i<m;i++)
		{
			for (int j=0;j<n;j++)
			{
			if (i == 0 || j == 0)
				{
				sp[i][j]=1;
				}
			else
				{
				sp[i][j]=sp[i-1][j]+sp[i][j-1];
				}
			}
		}
		return sp[m-1][n-1];
	}
}
