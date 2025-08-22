class Solution {
    public int minimumArea(int[][] grid) {
       int m=grid.length;
       int n=grid[0].length;
    //    System.out.println(m);
    //    System.out.println(n);
       int min1=m,max1=0,min2=n,max2=0;
       for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            if(grid[i][j]==1){
            min1=Math.min(min1,i);
            max1=Math.max(max1,i);
            min2=Math.min(min2,j);
            max2=Math.max(max2,j);
              //    System.out.println(min1);
               //    System.out.println(max1);
            }
        }
       } 
       return (max1-min1+1)*(max2-min2+1);
    }
}