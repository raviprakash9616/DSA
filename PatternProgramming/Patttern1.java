package PatternProgramming;

public class Patttern1 {
    public static void ptrn1(int n){
        for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            if(i==0 || j==0 || j==n-1 || i==n-1){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
            System.out.println();
        }
    }
    // pattern2
    public static void ptrn2(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0 || j==0 || j==n-1 || i==(n-1)/2){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    //PATTERN3
    public static void ptrn3(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j==0 || j==n-1 || i==(n-1)/2){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    //PATTERN4
    public static void ptrn4(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0 && j>0 && j<(n-1)/2 || j==0 && i>0 || i==(n-1)/2 && j<=(n-1)/2 || j==(n-1)/2 && i>0){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // ptrn1(10);
       // ptrn2(12`);
       // ptrn3(10);
        ptrn4(10);
    }
}
