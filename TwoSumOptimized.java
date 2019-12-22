import java.util.Arrays;
import java.util.HashMap;

public class TwoSumOptimized {


    public static void main(String args[]) {
        int a [] =twoSum( new int[] {1,3,4,5,6,7,12},12);
        System.out.println(Arrays.toString(a));

    }

    public static int[] twoSum(int [] num, int target) {
        HashMap<Integer, Integer> sum = new HashMap<Integer,Integer>();

        for(int i= 0; i<num.length; i++)
        {
            int addNum = target-num[i];
            if(sum.containsKey(addNum))
            {
                return new int[] {sum.get(addNum), i};
            }
                sum.put(num[i],i);

        }return null;

    }
}
