class Solution {
    public int tallestBillboard(int[] rods) {
        int sum = Arrays.stream(rods).sum();
        int[] dp = new int[sum + 1];
        Arrays.fill(dp, -1);
        dp[0] = 0;

        for (int rod : rods) {
            int[] dp2 = dp.clone();
            for (int i = 0; i + rod <= sum; i++) {
                if (dp[i] >= 0) {
                    dp2[i + rod] = Math.max(dp2[i + rod], dp[i]);
                    dp2[Math.abs(i - rod)] = Math.max(dp2[Math.abs(i - rod)], dp[i] + Math.min(i,rod));
                }
            }
            dp = dp2;
        }

        return dp[0];
    }
}