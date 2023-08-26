class Solution {
    public int missingNumber(int[] nums) {
        int currSum = 0;
        int max = 0;
        boolean isZeroPresent = false;
        
        for(int i: nums) {
            max = Math.max(max, i);
            currSum += i;
            
            if(i == 0)
                isZeroPresent = true;
        }
        
        int expectedSum = (max * (max + 1)) / 2;
        if(expectedSum == currSum && isZeroPresent) {
            return max + 1;
        }
        return expectedSum - currSum;
    }
}