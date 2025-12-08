/**
 * @param {number[]} nums
 * @param {(accum: number, curr: number) => number} fn
 * @param {number} init
 * @return {number}
 */
var reduce = function(nums, fn, init) {
    let val = init;

    for (let i = 0; i < nums.length; i++) {
        val = fn(val, nums[i]);
    }

    return val;
};
