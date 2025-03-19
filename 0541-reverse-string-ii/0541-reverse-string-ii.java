class Solution {
    public String reverseStr(String s, int k) {
      char[] arr = s.toCharArray();  
        int n = arr.length;

        for (int i = 0; i < n; i += 2 * k) {  
            int l = i, r = Math.min(i + k - 1, n - 1);  
            while (l < r) {
                char temp = arr[l];
                arr[l++] = arr[r];
                arr[r--] = temp;
            }
        }
        return new String(arr);   
    }
}