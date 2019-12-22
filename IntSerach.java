public class IntSerach {

    public static void main(String args[])
    {
        int [] a = {1,3,5,6,7,8,10};
        int target = 8;

        System.out.println(search(a,target));


    }

    public static int search(int[] nums, int target)
    {

        int l=0;
        int r =nums.length-1;
        while(l<=r)
        {
            int mid= l + (r-1)/2;


            if(nums[mid] == target)
            {
                return mid;
            }

            else if(nums[mid]<target)
            {
                l=mid+1;
            }

            else
            {
                r=mid-1;
            }
        }
        return -1;

    }


}
