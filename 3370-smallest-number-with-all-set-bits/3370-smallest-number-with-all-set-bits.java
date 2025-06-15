class Solution {
    public int smallestNumber(int n)
    {
      if(n<2)
      return 1;
      if((n&(n-1))==0)
      n=n+1;
      for(int i=n;i<n*n;i++)
      {
        if((i&(i-1))==0)
        {
        return i-1;
        }
      } 
      return 0;

    }
}