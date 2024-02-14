function rearrangeArray(nums: number[]): number[] {
    let ans : number[];
        ans =[nums.length];
        let pos = 0, neg = 1;

        for(let i = 0; i<nums.length; i++){
            if(nums[i] > 0){
                ans[pos] = nums[i];
                pos +=2;
            }else{
                ans[neg] = nums[i];
                neg +=2;
            }
        }
        return ans;
};