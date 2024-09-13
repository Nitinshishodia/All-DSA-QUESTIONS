import java.util.Arrays;

class Solution {
        public  static void  transpose(int[][] matrix) {
            int n = matrix.length;
            int m = matrix[0].length;
            for(int i = 0; i<n; i++){
                for(int j =i; j<m; j++){
                    // transpose the matrix
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }
         
    }
        public static void main(String[] args) {
            int matrix[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
            transpose(matrix);
            for(var mat : matrix){
                System.out.println(Arrays.toString(matrix));

            }
        }
            
        }

