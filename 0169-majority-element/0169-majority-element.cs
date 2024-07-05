public class Solution {
    public int MajorityElement(int[] nums) {
        int count = 0, result = 0;

        for(int i = 0; i < nums.Length; i++) {
            if(count == 0) {
                result = nums[i];
                count++;
                continue;
            }

            if(result == nums[i])
                count++;
            else
                count--;
        }

        return result;
    }
}