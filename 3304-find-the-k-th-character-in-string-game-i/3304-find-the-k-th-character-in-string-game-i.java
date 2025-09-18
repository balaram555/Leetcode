class Solution {
    public char kthCharacter(int k) {
     if(k==1) return 'a';
     int i=1;
     while(i*2<k){
        i*=2;
     }   
     if(k<=i)
     return kthCharacter(k);
     else{
     char p=kthCharacter(k-i);
     return help(p);
     }
    }
    public char help(char c){
        if(c=='z')
        return 'a';
        else
        return (char)(c+1);
    }
}