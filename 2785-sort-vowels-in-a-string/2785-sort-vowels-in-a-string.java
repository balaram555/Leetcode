class Solution {
    public String sortVowels(String s) {
        String v="aeiouAEIOU";
        ArrayList<Character>list=new ArrayList<>();
        for(char c:s.toCharArray()){
            if(v.indexOf(c)!=-1){
                list.add(c);
            }
        }
        Collections.sort(list);
        StringBuilder result=new StringBuilder();
        int i=0;
        for(char c:s.toCharArray()){
            if(v.indexOf(c)!=-1){
                result.append(list.get(i++));
            }
            else
            result.append(c);
        }
        return result.toString();
    }
}