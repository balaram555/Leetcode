class Solution {
    public String clearDigits(String s) {
        StringBuilder keep=new StringBuilder();
        for(char ch:s.toCharArray()){
            if(Character.isDigit(ch)){
                keep.deleteCharAt(keep.length()-1);
            }
            else{
                keep.append(ch);
            }
        }
        return keep.toString();
    }
}