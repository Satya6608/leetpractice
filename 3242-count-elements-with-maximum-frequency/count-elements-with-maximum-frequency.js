/**
 * @param {number[]} nums
 * @return {number}
 */
var maxFrequencyElements = function(nums) {
     const map = new Map();
        for (const num of nums) {
            map.set(num, (map.get(num) || 0) + 1);
        }
        
        let maxfreq = 0;
        for (const freq of map.values()) {
            maxfreq = Math.max(maxfreq, freq);
        }
        
        let count = 0;
        for (const freq of map.values()) {
            if (freq === maxfreq) {
                count += maxfreq;
            }
        }
        return count;
};