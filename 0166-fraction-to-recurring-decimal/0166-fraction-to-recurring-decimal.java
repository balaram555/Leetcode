class Solution {
    public String fractionToDecimal(int numerator, int denominator) {
        long n=numerator;   
        long d=denominator;
        if(n%d==0)
        return Long.toString(n/d);
        StringBuilder res=new StringBuilder();
         if ((n < 0) ^ (d< 0)) {
            res.append("-");
        }
        long num=Math.abs((long)n);
        long den=Math.abs((long)d);
        res.append(num/den);
        res.append(".");
        num %=den;
        HashMap<Long,Integer> map=new HashMap<>();
        while (num != 0) {
            if (map.containsKey(num)) {
                int ind= map.get(num);
                res.insert(ind, "(");
                res.append(")");
                break;
            }
            map.put(num, res.length());
            // System.out.println(num);
            // System.out.println(res.length());
            num *= 10;
            res.append(num / den);
            num %= den;
        }
      return res.toString();
    }
}