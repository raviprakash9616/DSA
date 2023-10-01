package array;
// Its Time Complexity Is Also big O(N^2)
// Its like PLaying cards we put right element at right position from the Unsorted Part Of Array
public class InsertionSort {
    public static void printArray(int arr[]){
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void insertionSort1(int arr[]){
        int n=arr.length;
        for(int i=1;i<n;i++){
            int curr=arr[i];
            int prev=i-1;
            while(prev>=0 && arr[prev]>curr){
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=curr;
        }
    }
    public static void main(String[] args) {
        int arr[]={1,8,5,6,10};
        insertionSort1(arr);
        printArray(arr);
    }
}
