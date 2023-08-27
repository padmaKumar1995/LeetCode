class Solution {
    public int countElements(int[] arr) {
        Set<Integer> elements = new HashSet<Integer>();
        int ans = 0;
        
        for(int i: arr) {
            elements.add(i);
        }
        
        for(int i: arr) {
            if(elements.contains(i + 1)) {
                ans++;
            }
        }
        
        return ans;
    }
}