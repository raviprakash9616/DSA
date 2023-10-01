package array;
// KANDANES ALGORITHM APPOROACH
//IF THERE IS ANY NEGATIVE SUM IS OCCUR THEN WE SET IT INTO ZERO BECAUSE ZERO  IS MUCH BETTER THAN NEGATIVE NUMBER
// It is used to calculate the maximum sum of subarray
public class KandanesAlgorithm {
    public static void printSubArray(int arr[]){
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++) {
            currSum += arr[i];
            if (currSum < 0) {
                currSum = 0;
            }
            maxSum=Math.max(currSum,maxSum);
        }
        System.out.println(maxSum);
    }
    public static void main(String[] args) {
      int arr[]={-2,-3,4,-1,-2,1,5,-3};
      printSubArray(arr);
    }
}
