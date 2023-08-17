class Solution {
    public int minStartValue(int[] nums) {
        int n = nums.length;
        int startValue = 1;
        int stepSum = 1;
        
        for(int i = 0; i < n; i++){
            stepSum += nums[i];
            
            if(stepSum <= 0){
                startValue += calValue(stepSum);
                stepSum = 1;
            }
        }
        return startValue;
    }
    
    private int calValue(int stepSum){
        if(stepSum == 0)
            return 1;
        
        return 1 + (-1 * stepSum);
    }
}