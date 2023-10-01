package DivideAndConquer;

public class Rotated_Sorted_Array {
//    public static void printArray(int arr[]){
//        for(int i=0;i< arr.length;i++){
//            System.out.print(arr[i]);
//        }
//        System.out.println();
//    }
    public static int search(int arr[], int target,int si,int ei) {
        if(si>ei){
            return -1;
        }
        int mid = si + (ei - si) / 2;
        if (arr[mid] == target) {
            return mid;
        }
        // Mid On l1
               if(arr[si]<=arr[mid]){
                        // Case A left Part
                   if(arr[si]<=target && target<=arr[mid]) {
                       return search(arr, target, si, mid - 1);
                   }
            // Case b: Left Part
                   else {
                       return search(arr, target, mid + 1, ei);
                   }
        }
        //Mid On L2
        else{
     // Case C:Left Part
          if(arr[mid]<=target && target<=arr[ei]){
              return search(arr,target,mid+1,ei);
          }
          else{
              // Case D: Left Me Search Karna Hai
              return search(arr,target,si,mid-1);
          }
        }
    }
    public static void main(String[] args) {
        int arr[]={4,5,6,7,0,1,2};
        int target=7;
        int srcIdx=search(arr,target,0, arr.length-1);
        System.out.println(srcIdx);
    }
}
