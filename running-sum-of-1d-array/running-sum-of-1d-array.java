class Solution {
    public int[] runningSum(int[] nums) {
        int n = nums.length;
        int[] rs = new int[n];
        
        rs[0] = nums[0];
        for(int i = 1; i < n; i++){
            rs[i] += rs[i - 1] + nums[i];
        }
        
        return rs;
    }
}