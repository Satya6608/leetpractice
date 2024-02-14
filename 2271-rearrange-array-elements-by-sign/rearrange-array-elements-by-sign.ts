function rearrangeArray(nums: number[]): number[] {
    let posI = 0
    let negI = 1
    const output = new Array(nums.length)
    nums.forEach(num => {
        if (num > 0) {
            output[posI] = num
            posI += 2
        } else if (num < 0) {
            output[negI] = num
            negI += 2
        }
    })
    return output
};