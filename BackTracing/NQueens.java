package BackTracing;

public class NQueens {
    public static boolean isSafe(char board[][],int row,int col){
        //Vertical Up
        for(int i=row-1;i>=0;i--){
            if(board[i][col]=='Q') {
                return false;
            }
        }
        //Diagonal Left Up
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(board[i][j]=='Q') {
                return false;
            }
        }
        //Diagonal Right Up
        for(int i=row-1,j=col+1;i>=0 && j< board.length;i--,j++){
            if(board[i][j]=='Q') {
                return false;
            }
        }
        return true;
    }
    public static void nQueens(char board[][],int row){
        // Base Case
        if(row==board.length){
            //Total Ways To count n queens :
            count++;
           // printBoard(board);
            return;
        }
        //Column Loops
        for(int j=0;j< board.length;j++){
            // Condition To Check whether it is possible to sit Queens or Not
            if(isSafe(board,row,j)){
                board[row][j]='Q';
                nQueens(board,row+1); // Function Call
                board[row][j]= 'x';  // BackTracing
            }
        }
    }
    public static void printBoard(char board[][]){
        System.out.println("-----------ChessBoard-------------");
        for(int i=0;i< board.length;i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    static int count=0;
    public static void main(String[] args) {
        int n=6;
        char board[][]=new char[n][n];
        // Initialization
        for(int i=0;i< n;i++){
         for(int j=0;j< n;j++){
             board[i][j] ='X';
         }
        }
        nQueens(board,0);
        System.out.println("Total Ways To Solve N queens:"+count);
    }
}
