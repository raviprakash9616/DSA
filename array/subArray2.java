package array;

public class subArray2 {
    public static void printSubArray(int []num){
for(int i=0;i<num.length;i++){
    int start=i;
    for(int j=i;j<num.length;j++){
        int end=j;
        for(int k=start;k<=end;k++){
            System.out.print(num[k]+"  ");
        }
        System.out.println();
    }
}
    }
    public static void main(String[] args) {
        int num[]={2,4,5,6,7};
   printSubArray(num);
    }
}
