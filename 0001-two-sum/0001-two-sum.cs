public class Solution {
    public int[] TwoSum(int[] nums, int target) {
        int[] result = new int[2];
        Dictionary<int, int> freq = new Dictionary<int, int>();

        for(int i = 0; i < nums.Length; i++) {
            if(freq.ContainsKey(nums[i])) {
                continue;
            }
            else {
                freq.Add(nums[i], i);
            }
        }

        for(int i = 0; i < nums.Length; i++) {
            int temp = target - nums[i];

            if(freq.ContainsKey(temp) && freq[temp] != i) {
                result[0] = i;
                result[1] = freq[temp];
            }
        }

        return result;
    }
}