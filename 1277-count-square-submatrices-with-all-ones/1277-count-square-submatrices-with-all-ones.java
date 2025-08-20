class Solution {
    public int countSquares(int[][] matrix) {
       int ln=matrix.length;
       int a=matrix[0].length;
       int sum=0;
       for(int i=0;i<ln;i++){
        for(int j=0;j<a;j++){
            if(i>0&&j>0&&matrix[i][j]!=0){
                matrix[i][j]=Math.min(Math.min(matrix[i][j-1],matrix[i-1][j]),matrix[i-1][j-1])+1;
            }
            sum+=matrix[i][j];
        }
       }
       return sum; 
    }
}