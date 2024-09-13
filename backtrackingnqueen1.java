public class backtrackingnqueen1 {
    public static boolean isSafe(char board[][] , int row , int column){
        // vertically up
        for(int i = row-1; i>=0;i--){
              if(board[i][column] == 'Q'){
                return false;
              }
        }

        // Diagonally left up

        for(int i = row-1, j=column-1; i>=0 && j>=0; i--, j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }

        // Diagonally Right up
        for(int i = row-1 , j=column+1; i>=0 && j<board.length; i--, j++){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        return true;
    }
    public static void nQueens(char board[][] , int row){
        // base case
        if(row == board.length){
            PrintBoard(board);
            return;
        }
        // column loop
        for(int j = 0; j<board.length; j++){
            if(isSafe(board , row , j)){
                board[row][j] ='Q';
                nQueens(board, row+1);
                board[row][j] = 'x';
            }
        }
    }

    public static void PrintBoard(char board[][]){
        System.out.println("------------chess board--------------------");
        for(int i =0; i<board.length; i++){
            for(int j =0; j<board.length; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        
    }
    public static void main(String[] args) {
        int n = 4;
        char board[][] = new char[n][n];
        // Initialization
        for(int i = 0; i<board.length; i++){
            for(int j =0; j<board.length; j++){
                board[i][j] = 'x';
            }
        }
        nQueens(board , 0);
    }
}
