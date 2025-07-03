class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
       int dist=0;
       while(mainTank>4){
         mainTank -=5;
         dist +=50;
         if(additionalTank>0){
            mainTank +=1;
            additionalTank -=1;
       } 
       }
       dist +=mainTank*10;
      return dist; 
    }
    
}