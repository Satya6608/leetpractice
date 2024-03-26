/**
 * @param {number[]} nums
 * @return {number}
 */
var firstMissingPositive = function(nums) {
     let i=0;
       while(i<nums.length)
       {
           let correct = nums[i]-1;
           if(nums[i]>0 && nums[i]<=nums.length && nums[i]!=nums[correct])
           {
               swap(nums,i,correct);
           }
           else
           {
               i++;
           }
           }
           for(let index=0; index<nums.length; index++)
           {
               if(nums[index]!=index+1)
               {
                   return index+1;
               }
           }
           return nums.length+1;
       } 
function swap(nums, first, second)
       {
           let temp = nums[first];
           nums[first] = nums[second];
           nums[second] = temp;

       }