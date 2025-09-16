class Solution {
    public List<Integer> replaceNonCoprimes(int[] nums) {
        List<Integer> ans=new ArrayList<>();
        for (int num : nums) {
            ans.add(num);
            while (ans.size() > 1) {
                int a = ans.get(ans.size() - 1);
                int b = ans.get(ans.size() - 2);
                int g = gcd(a, b);
                if (g == 1) break; 
                int l = lcm(a, b);
                ans.remove(ans.size() - 1);
                ans.remove(ans.size() - 1); 
                ans.add(l); 
            }
        }
        
        return ans;
    }
    public int gcd(int a,int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
    public int lcm(int a, int b) {
    return (int) ((long) a * b / gcd(a, b));
    }
}