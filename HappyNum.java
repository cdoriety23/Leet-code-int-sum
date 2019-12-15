

import java.util.HashSet;


public class HappyNum {

    public static void main(String args[]) {
        System.out.println(isHappy(1)); //True
        System.out.println(isHappy(8)); //False
        System.out.println(isHappy(7)); //True
        System.out.println(isHappy(12)); //False

    }

        public  static boolean isHappy(int n) {
            HashSet<Integer> set = new HashSet<Integer>();
            if(n == 1) {
                return true;
            }
            while(set.add(n)) {
                int sum = 0;
                while(n > 0) {
                    sum = sum + (n%10)*(n%10);
                    n = n/ 10;
                }
                n = sum;

                if(n == 1) {
                    return true;
                }
            }

            return false;
        }
    }









