class Solution {
    public int missingNumber(int[] nums) {
        Set<Integer> wholeNumbers = new HashSet<Integer>();
        
        for(int i: nums) {
            wholeNumbers.add(i);
        }
        
        for(int i = 0; i <= nums.length; i++) {
            if(!wholeNumbers.contains(i))
                return i;
        }
        
        return 0;
    }
}