class Solution {
    public boolean increasingTriplet(int[] nums) {
        int a = Integer.MAX_VALUE;
        int b = Integer.MAX_VALUE;
        for(final int num : nums)
        if(num <= a) a = num;
        else if(num > a && num <= b) b = num;
        else  return true;

        return false;
    }
}