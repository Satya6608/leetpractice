class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] ans = new int[nums.length];
        int start = 0;
        int last = nums.length - 1;
         
        int ptr = nums.length - 1;

         while(start <= last){
            int ss = nums[start] * nums[start];
            int es = nums[last] * nums[last];

            if(ss > es){
                ans[ptr] = ss;
                start++;
            }else{
                ans[ptr] = es;
                last--;
            }
            ptr--;
        }
    return ans;
    }
}