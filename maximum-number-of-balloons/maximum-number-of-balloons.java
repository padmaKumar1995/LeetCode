class Solution {
    public int maxNumberOfBalloons(String text) {
        Map<Character, Integer> freq = new HashMap<>();
        freq.put('b', 0);
        freq.put('a', 0);
        freq.put('l', 0);
        freq.put('o', 0);
        freq.put('n', 0);
        
        for(char c: text.toCharArray()) {
            if(freq.containsKey(c)) {
                freq.put(c, freq.get(c) + 1);
            }
        }
        
        int ans = 0;
        while(!freq.values().contains(0) && freq.get('l') >= 2 && freq.get('o') >= 2) {
            ans++;
            freq.replaceAll((k, v) -> v - 1);
            freq.put('l', freq.get('l') - 1);
            freq.put('o', freq.get('o') - 1);
        }
        
        return ans;
    }
}