public class MissingNum {

    public static void main(String args[])
    {
            int [] a= new int[] {3,0,1};
            System.out.println(missingNum(a));
    }

    public static int missingNum(int[] nums) {

        int nthSum = (nums.length * (nums.length + 1)) / 2;
        int sum = 0;
        for(int num:nums) {
            sum += num;
        }
        return nthSum-sum;

    }
}

