package Recursion;

public class LastOccurence {
    public static int lastoccurence(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
        int isFound=lastoccurence(arr,key,i+1);
        if(isFound==-1 && arr[i]==key){
            return i;
        }
        return isFound;
    }
    public static void main(String[] args) {
        int arr[]={1,2,5,3,4};
                int i=0;
                int key=5;
        int result=lastoccurence(arr,key,i);
        System.out.println(result);
    }
}
