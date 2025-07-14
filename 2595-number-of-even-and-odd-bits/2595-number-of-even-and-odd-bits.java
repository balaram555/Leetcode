class Solution {
    public int[] evenOddBit(int n) 
    {
      int even=0,odd=0,cnt=0;
      while(n>0)
      {
        cnt++;
        if((n&1)>0)
        {
          if(cnt%2==0)
          even++;
          else
          odd++;
        }
        n=n>>1;
    }  
    int arr[]=new int[2];
    arr[1]=even;
    arr[0]=odd;
    return arr;
    }
    
}