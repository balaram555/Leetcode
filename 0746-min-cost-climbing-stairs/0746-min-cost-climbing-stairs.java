class Solution {
    public int solve(int[] cost, int idx, ArrayList<Integer> l) {
        int n = cost.length;
        if(idx >= n) {
            return 0;
        }

        if(l.get(idx) != -1) {  
            return l.get(idx);
        }

        int a = cost[idx] + solve(cost, idx + 1, l);
        int b = cost[idx] + solve(cost, idx+2, l);
        l.set(idx, Math.min(a, b));
        return l.get(idx);
    }
    public int minCostClimbingStairs(int[] cost) {
        
        ArrayList<Integer> l = new ArrayList<>();
        for(int i=0; i<cost.length; i++) {
            l.add(-1);
        }

         int a = solve(cost, 0, l);
         int b = solve(cost, 1, l);
        return Math.min(a, b);
    }
}

/// -1 -1 -1
//  25  15  20

// 10 15 20
// // 
//                 10 
            
//           15         20[ 30 ] 

//     20 [ 45]   [25]

// 10 15 20
        //         15
        //     20      [end]- 15
        // [35]

    //    [10,15,20]
    //            