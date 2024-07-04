public class Solution {
    public void Rotate(int[] nums, int k) {
        int[] rotated = new int[nums.Length];

        for(int i = 0; i < nums.Length; i++) {
            int pos = (i + k) % nums.Length;
            rotated[pos] = nums[i];
        }

        for(int i = 0; i < nums.Length; i++) {
            nums[i] = rotated[i];
        }
        
    }
}