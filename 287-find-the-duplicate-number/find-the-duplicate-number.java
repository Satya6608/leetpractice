class Solution {
    public int findDuplicate(int[] nums) {
        int a[] =new int[nums.length+1];

        for(int i=0; i<nums.length; i++){
            if(a[nums[i]]==1)
            return nums[i];
            else
            a[nums[i]]++;
        }
        return 0;
    }
}