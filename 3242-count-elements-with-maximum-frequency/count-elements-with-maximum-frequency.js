/**
 * @param {number[]} nums
 * @return {number}
 */
var maxFrequencyElements = function(nums) {
     const map = new Map()

    for(const num of nums) {
        map.set(num, (map.get(num) || 0) + 1)
    }

    let mx = -1, mxNum = 0

    for(const val of map.values()) {
        if(val === mx) {
            mxNum++
        }

        if(val > mx) {
            mxNum = 1
            mx = val
        }
    }

    return mx * mxNum
};