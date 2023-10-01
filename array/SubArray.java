package array;

public class SubArray {
    public static void subArray1(int[]arr){
        for(int i=0;i<arr.length;i++){
            int curr=arr[i];
         for(int j=i+1;j<arr.length;j++) {
             System.out.print("(" + curr + "," + arr[j] + ")");
         }
             System.out.println();
         }
        }
    public static void main(String[] args) {
        int arr[]={ 1,-3,5,6,7};
        subArray1(arr);
    }
}
