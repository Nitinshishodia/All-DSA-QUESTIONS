public class fourDirectionMazePath {
    public static void main(String[] args) {
        int rows=3;
         int cols=3;
         boolean[][] isVisited=new boolean[rows][cols];

         print(0,0,rows-1,cols-1,"");
    }
    private static void print(int sr, int sc, int er, int ec, String s){
        if(sr<1 || sc<1)return;
        if(sr==er || sc==ec){
            System.out.println(s);
            return;
        }
        // go right
        print(sr, sc+1, er, ec, s+ "R");
        // go down
        print(sr+1, sc, er, ec,s+"D");
        // go left
        print(sr, sc-1, er, ec, s+"L");
        // go up
        print(sr-1, sc, er, ec, s+"U");
    }
}
