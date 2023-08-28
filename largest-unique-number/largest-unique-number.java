class Solution {
    public int largestUniqueNumber(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        
        for(int num: nums) {
            freq.putIfAbsent(num, 0);
            freq.put(num, freq.get(num) + 1);
        }
        
        int max = -1;
        
        for(int key: freq.keySet()) {
            if(key > max && freq.get(key) == 1) {
                max = key;
            } 
        }
        
        return max;
    }
}