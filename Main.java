package com.company;

public class Main {

    public static void main(String args[]) {
        int a[] = {-2, 1, -3, 4, -1, 2, 1 ,- 5, 4}; // answer should be 6 using element 4,2,1,-1
        int b[] = {4,3,1,-5,-2,1};// answer is 8 using elements 4,3,1
        System.out.println(maxSubArray(a));
        System.out.println(maxSubArray(b));

    }

    public static int maxSubArray(int[] A) {
        int maxSum = A[0];
        int cSum = A[0];

        for (int i = 1; i < A.length; i++) {
            cSum += A[i];
            {
                if (A[i] > cSum) {
                    cSum = A[i];
                }
                if (cSum > maxSum) {
                    maxSum = cSum;
                }
            }

        }return maxSum;
    }
}
