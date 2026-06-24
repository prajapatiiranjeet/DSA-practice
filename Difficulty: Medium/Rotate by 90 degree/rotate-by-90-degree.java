class Solution {
    public void rotateMatrix(int[][] mat) {
        // code here
          int n = mat.length;
          int m = mat[0].length;
        int[][] matrix1 = new int [m][n];
          
          int x = 0;
          
    //   for(int i = m - 1; i >= 0; i--){
     for (int i = m - 1; i >= 0; i--) {
           int y = 0;
           for(int j = 0; j < n; j++){
               
               matrix1[x][y] = mat[j][i];
               y++;
           }
           x++;
       }
       
       for(int i = 0; i < n; i++){
           for(int j = 0; j< m ;j++){
               mat[i][j] = matrix1[i][j];
           }
       }
    }
}