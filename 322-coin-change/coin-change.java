class Solution {
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        int[][] t = new int[n + 1][amount + 1];

        for(int i = 0; i<= n; i++){
            for(int j = 0; j<=amount; j++){
                if(j==0){
                    t[i][j] = 0;
                }else{
                    t[i][j] = Integer.MAX_VALUE-1;
                }
            }
        }


        for(int i =1; i<= n; i++){
            for(int j=1; j<= amount; j++){
                if(coins[i-1] <= j){
                    t[i][j] = Math.min(t[i][j-coins[i-1]]+1, t[i-1][j]);
                }else{
                    t[i][j] = t[i-1][j];
                }
            }
        }

        return t[n][amount] == Integer.MAX_VALUE - 1 ? -1 : t[n][amount];
        // if(amount == 0) return 0;

        // int ans = Integer.MAX_VALUE;

        // for(int i = 0; i<coins.length; i++){
        //     if(amount-coins[i] >= 0){
        //     int subAns = coinChange(coins, amount-coins[i]);
        //     if(subAns != Integer.MAX_VALUE && subAns + 1 < ans){
        //         ans= subAns + 1;
        //     }
        //     }
        // }
        // return ans;
    }
}