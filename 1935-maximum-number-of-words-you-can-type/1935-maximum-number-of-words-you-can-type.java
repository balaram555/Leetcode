class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
     boolean[] check=new boolean[26];
     for(char c:brokenLetters.toCharArray()){
        check[c-'a']=true;
     }  
     String words[]=text.split(" ");
     int count=0;
     for(String word:words){
        boolean a=true;
        for(char c:word.toCharArray()){
            if(check[c-'a']==true){
                a=false;
                break;
            }
        }
        if(a==true) 
        count++;
     }
     return count;
    }
}