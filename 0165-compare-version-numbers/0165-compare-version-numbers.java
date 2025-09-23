class Solution {
    public int compareVersion(String version1, String version2) {
        String[] c1=version1.split("\\.");
        String[] c2=version2.split("\\.");
        int a=c1.length;
        int b=c2.length;
        
        int n=Math.max(a,b);
        for(int i=0;i<n;i++){
            int num1;
            if(i<a)
            num1=Integer.parseInt(c1[i]);
            else
            num1=0;
            int num2;
            if(i<b)
            num2=Integer.parseInt(c2[i]);
            else
            num2=0;
            
            if(num1<num2)
            return -1;
            if(num1>num2)
            return 1;
        }
        return 0;
    }
}