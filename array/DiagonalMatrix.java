package array;

public class DiagonalMatrix {
    public static int diagonalMatrix1(int matrix[][]){
        int n=matrix.length;
        int sum=0;
//        for(int i=0;i<n;i++){
//        for(int j=0;j<n;j++){
//            if(i==j){
//                sum+=matrix[i][j];
//            }
//            else if(i+j==n-1){
//                sum+=matrix[i][j];
//            }
//       }
        //Primary Diagonal
        for(int i=0;i<n;i++){
          sum+=matrix[i][i];
          //Secondary Diagonal
            if(i!=n-1-i) {
                sum += matrix[i][n - 1 - i];
            }
       }
      return sum;
    }
    public static void main(String[] args) {
        int matrix[][]={{1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}};
        System.out.println(diagonalMatrix1(matrix));
    }
}
