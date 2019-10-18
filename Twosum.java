class TwoSum {
    public int[] twoSum(int[] nums, int target) {
		int one=0,two=0;
		
		for(int i=0;i<nums.length;i++)
		{
			for(int j=0;j<nums.length;j++)
			{
				if((nums[i]+nums[j]==target) && (i != j))
						{
							one=i;
							two=j;
						}
			}
		}

    
  int[] index = new int[2];
    index[1] =one;
    index[0] =two;
    return index;
    }
}   
