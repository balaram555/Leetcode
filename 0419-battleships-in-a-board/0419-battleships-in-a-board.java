class Solution {
    public int countBattleships(char[][] board) {
        int a=board.length;
        int b=board[0].length;
        int count=0;
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                if((board[i][j]=='X')&&(i==0||board[i-1][j]=='.')&&(j==0||board[i][j-1]=='.'))
                count++;
            }
        }
        return count;
    }
}