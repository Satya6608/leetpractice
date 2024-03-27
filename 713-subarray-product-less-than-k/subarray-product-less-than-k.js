/**
 * @param {number[]} nums
 * @param {number} k
 * @return {number}
 */
var numSubarrayProductLessThanK = function(nums, k) {

        let left = 0, right = 0, product = 1, count = 0;
        let n = nums.length;

        while(right<n){
          if (k <= 1) return 0;
          product *= nums[right];
          while(product >= k && left <= right) product /= nums[left++];

          count += 1 + (right - left);
          right++;
        }

        return count;
};