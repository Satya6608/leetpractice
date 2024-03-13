class Solution {

    int rec(int [] rod, int diff, int idx, int [][]dp){
      if(idx<0){
        if(diff == 0) return 0;
        return Integer.MIN_VALUE;
      }
      if(dp[idx][diff+5000] != -1) return dp[idx][diff+5000];

      int notpick = rec(rod, diff, idx-1, dp);
      int pick1 = rod[idx] + rec(rod, diff+rod[idx],idx-1,dp);
      int pick2 = rec(rod,diff-rod[idx], idx-1, dp);

      dp[idx][diff+5000] = Math.max(notpick, Math.max(pick1, pick2));

      return dp[idx][diff+5000]; 
    }

    public int tallestBillboard(int[] rods) {
        int [][] dp = new int [rods.length][10001];
        for(int i=0; i<rods.length;i++) Arrays.fill(dp[i], -1);
        return rec(rods, 0, rods.length-1, dp);
    }
}