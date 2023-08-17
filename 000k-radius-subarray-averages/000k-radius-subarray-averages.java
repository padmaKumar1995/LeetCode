class Solution {
    public int[] getAverages(int[] nums, int k) {
        int n = nums.length;
        long dia = 2 * k + 1;
        int[] ans = new int[n];
        Arrays.fill(ans, -1);
        
        if(dia > n) {
            return ans;
        }
        
        long[] prefixSum = new long[n + 1];
        for(int i = 1; i <= n; i++){
            prefixSum[i] = prefixSum[i - 1] + nums[i - 1];
        }
        
        for(int i = k; i < (n - k); i++) {
            long sum = prefixSum[i + k + 1] - prefixSum[i - k];
            ans[i] = (int)(sum / dia);
        }
        
        return ans;
    }
}