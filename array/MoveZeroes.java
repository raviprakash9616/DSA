package array;
import java.util.*;
public class MoveZeroes {
    public static int[] moveZeroes1(int[] arr,int n){
        ArrayList<Integer> temp=new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            if(arr[i]!=0){       // Time Complexity:O(n);
                temp.add(arr[i]);
            }
        }
        int nz= temp.size();
        for(int i=0;i<nz;i++){  // Time Complexity:O(x);
          arr[i]=temp.get(i);
        }
       for(int i=nz;i<n;i++){   // Time Complexity:O(n-x);
           arr[i]=0;
       }
       return arr;
    }
    public static void main(String[] args) {
      int arr[]={2,0,4,5,0,7,0,8};
      int n=8;
      int[] ans=moveZeroes1(arr,n);
      for(int i=0;i<n;i++){
          System.out.print(arr[i]+" ");
      }
        System.out.println("");
    }
}
// OverAll Time Complexity:O(2n);
// This Is A brute force Approach