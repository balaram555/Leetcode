class Solution {
    public int numberOfSubmatrices(char[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int[][] pre=new int[n][2];
        int ans=0;
        for(int i=0;i<m;i++){
            int x=0,y=0;
            for(int j=0;j<n;j++){
                if(grid[i][j]=='X')
                x++;
                else if(grid[i][j]=='Y')
                y++;

                pre[j][0] +=x;
                pre[j][1] +=y;

                if(pre[j][0]>0 && pre[j][0]==pre[j][1]){
                    ans++;
                }
            }
        }
        return ans;
    }
}