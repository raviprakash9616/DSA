package DivideAndConquer;

public class MergeSort {
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void mergeSrt(int arr[],int si,int ei) {
        if (si >= ei) {
            return;
        }
        //Kaam
        int mid = si + (ei - si)/ 2;
        mergeSrt(arr, si, mid);//left part
        mergeSrt(arr, mid+1, ei);//right part
        merge(arr, si, mid, ei);
    }
        public static void merge(int arr[],int si,int mid,int ei){
           int temp[]=new int[ei-si+1];
           int i=si;//iterator for left Part
            int j=mid+1;// iterator for right part
            int k=0; // iterator for temp arr
            while(i<=mid && j<=ei) {
                if (arr[i] < arr[j]) {
                    temp[k] = arr[i];
                    i++;
                }
                else {
                    temp[k] = arr[j];
                    j++;
                }
                k++;
            }
              // Left Prt Me Agar Kuch Bacha Hua HAI TOH
                while(i<=mid){
                    temp[k++]=arr[i++];
                }
                // Right Part Me Agar Kuch Bacha Hua Hai
                while(j<=ei){
                    temp[k++]=arr[j++];
                }
                // Copy Temp To Original Array
            for(k=0 ,i=si; k< temp.length;k++,i++){
                arr[i]=temp[k];
            }
        }
    public static void main(String[] args) {
        int arr[]={2,5,7,1,8,3};
        mergeSrt(arr,0,arr.length-1);
        printArray(arr);
    }
}
