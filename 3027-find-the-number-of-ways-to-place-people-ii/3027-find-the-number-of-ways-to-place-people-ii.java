class Solution {
    public int numberOfPairs(int[][] points) {
        int n=points.length;
        int count=0;
        Arrays.sort(points, (a, b) -> {
    if (a[0] != b[0]) {
        return Integer.compare(a[0], b[0]); 
    } else {
        return Integer.compare(b[1], a[1]); 
    }
});
        for(int i=0;i<n;i++){
            int m = Integer.MIN_VALUE;
            int max=points[i][1];
            for(int j=i+1;j<n;j++)
            {
                if(points[i][0]<=points[j][0]&&points[i][1]>=points[j][1]){
                    if (points[j][1] > m && max>m) {
                        count++;
                        m = points[j][1];
                    } 
                }
            }
        }
        return count;
 
    }
}