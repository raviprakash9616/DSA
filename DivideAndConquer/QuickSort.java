package DivideAndConquer;

public class QuickSort {
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void quickSrt(int arr[],int si,int ei){
            if(si>=ei){
                return;
            }
            //Last
            int pIdx=partition(arr,si,ei);
            quickSrt(arr,si,pIdx-1);
            quickSrt(arr,pIdx+1,ei);
        }
        public static int partition(int arr[],int si,int ei) {
            int pivot = arr[ei];
            int i = si - 1;
            for (int j = si; j < ei; j++) {
                if (arr[j] <= pivot) {
                    i++;
                    //Swap
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
            i++;
            int temp = pivot;
            arr[ei] = arr[i];
            arr[i] = temp; 
            return i;
        }
    public static void main(String[] args) {
        int arr[]={1,8,5,3,4,2};
        quickSrt(arr,0,arr.length-1);
        printArray(arr);
    }
}
