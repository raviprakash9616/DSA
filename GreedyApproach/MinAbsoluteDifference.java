package GreedyApproach;

import java.util.Arrays;
// Time Complexity: O(nlogn)
public class MinAbsoluteDifference {
    public static void main(String[] args) {
        int arrA[]={1,2,3};
        int arrB[]={2,1,3};
        Arrays.sort(arrA);
        Arrays.sort(arrB);
        int minDiff=0;
        for(int i=0;i<arrA.length;i++){
            minDiff+=Math.abs(arrA[i]-arrB[i]);
        }
        System.out.println("Minimum Absolute Difference:"+minDiff);
    }
}
