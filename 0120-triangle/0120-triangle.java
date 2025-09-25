class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n=triangle.size();
        for(int i=n-2;i>=0;i--){
            for(int j=0;j<triangle.get(i).size();j++){
                int a=triangle.get(i+1).get(j);
                int b=triangle.get(i+1).get(j+1);
                int ans=triangle.get(i).get(j)+Math.min(a,b);
                triangle.get(i).set(j,ans);
            }
        }
        return triangle.get(0).get(0);
    }
}