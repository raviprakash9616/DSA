package array;

public class SubArray3 {
    public static void printSubArray(int []arr){
        int currSum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i< arr.length;i++){
            int start=i;
            for(int j=i;j<arr.length;j++){
                int end=j;
                currSum=0;
                for(int k=start;k<=end;k++){
                    currSum+=arr[k];
                }
                System.out.println(currSum);
                if(max<currSum) {
                    max = currSum;
                }
            }
        }
        System.out.println("MaxSum:"+max);
    }
    public static void main(String[] args) {
        int arr[]={2,4,5,6,7};
        printSubArray(arr);

    }
}
