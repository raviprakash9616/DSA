package array;

public class CountSort {
    public static void countSort1(int arr[]) {
        int largest = Integer.MIN_VALUE;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            largest = Math.max(largest, arr[i]);
        }
        int count[] = new int[largest + 1];
        for (int i = 0; i < n; i++) {
            count[arr[i]]++;
        }
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] >0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }
    public static void printArray(int arr[]){
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
int arr[]={1,2,4,2,4,5,1,3};
    countSort1(arr);
    printArray(arr);
    }
}
