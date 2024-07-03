public class Solution {
    public bool Check(int[] nums) {
        int pivot = pivotIdx(nums);

        return isIncreasing(pivot, nums) && isDecreasing(pivot, nums) && isRotated(pivot, nums);
    }

    private int pivotIdx(int[] nums) {

        for(int i = 1; i < nums.Length; i++) {
            if(nums[i] < nums[i - 1]) {
                return i;
            }
        }

        return 0;
    }

    private bool isIncreasing(int pivotIdx, int[] nums) {

        for(int i = pivotIdx + 1; i < nums.Length; i++) {
            if(nums[i] < nums[i - 1]) {
                return false;
            }
        }

        return true;
    }

    private bool isDecreasing(int pivotIdx, int[] nums) {

        for(int i  = 1; i < pivotIdx; i++) {
            if(nums[i - 1] > nums[i]) {
                return false;
            }
        }

        return true;
    }

    private bool isRotated(int pivotIdx, int[] nums) {
        if(pivotIdx == 0 || nums.Length == 1) {
            return true;
        }

        return nums[0] >= nums[nums.Length - 1];
    }
}