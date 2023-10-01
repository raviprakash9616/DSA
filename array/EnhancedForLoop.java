package array;

public class EnhancedForLoop {
    public static void main(String[] args) {
       // int a[]={1,3,5,6,7};
        int b[][]= {
                {1, 2, 3, 5, 6},// ye Khud Ek Array Hai to print two D array
                {2, 5, 7, 7, 8},
                {3, 4, 6, 7, 7}
                 };
        // It Is Also Known as For Each Loop but In Java we Called it Enhanced For Loop
//        for(int n:a){ // n will fetch all values from an array and store it
//            System.out.print(n+" ");
//        }
        for(int n[]:b ){            // Ye For Loop Store Karega EK 2d Array Jo Uper Defined Hai
        for(int num:n){             // Ye For Loop Fetch Karega One By One Element ko
            System.out.print(num+" ");
        }
            System.out.println();
        }
    }

}
