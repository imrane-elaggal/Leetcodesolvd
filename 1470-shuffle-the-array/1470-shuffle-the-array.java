class Solution {
    public int[] shuffle(int[] nums, int n) {
         int[] res = new int[nums.length];
        int p = 0;
        int i = 0;
        int j = n;
        while (j < nums.length) {
            res[p++] = nums[i++];
            res[p++] = nums[j++];
        }
        return res;
    
    }
}