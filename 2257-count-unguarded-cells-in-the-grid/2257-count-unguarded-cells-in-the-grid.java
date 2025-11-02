class Solution {
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        int[][] grid=new int[m][n];
        for(int[] w:walls){
            grid[w[0]][w[1]]=1;
        }
        for(int[] g:guards){
            grid[g[0]][g[1]]=2;
        }
        int[][] dir={{1,0},{-1,0},{0,1},{0,-1}};
        for(int[] g: guards){
            for(int[] d:dir){
              int a=g[0]+d[0];
              int b=g[1]+d[1];
              while(a>=0&&a<m&&b>=0&&b<n&&grid[a][b]!=1&&grid[a][b]!=2){
                if(grid[a][b]==0){
                    grid[a][b]=3;
                }
                a +=d[0];
                b +=d[1];
              }
            }
        }
        int count=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==0)
                count++;
            }
        }
        return count;
    }
}