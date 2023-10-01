package array;
//IT IS OPPOSITE OF BUBBLE SORT WE PUT SMALLEST ELEMENT AT THE BEGINING OF AN ARRAY
// ITS TIME COMPLEXITY IS ALSO BIG O(N^2); BUT THE NO SWAPS WILL BE LESS THAN BUBBLE SORT

public class SelectionSort {
    public static void selectionSort1(int arr[]){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int minPos=i;
            for(int j=i+1;j<n;j++){
                if(arr[minPos]>arr[j]){
                    minPos=j;
                }
            }
            int temp=arr[minPos];
            arr[minPos]=arr[i];
            arr[i]=temp;
        }
    }
    public static void printArray(int arr[]){
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={1,8,5,6,10};
        selectionSort1(arr);
        printArray(arr);
    }

}
