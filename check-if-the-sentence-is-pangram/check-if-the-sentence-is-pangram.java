class Solution {
    public boolean checkIfPangram(String sentence) {
        int n = sentence.length();
        Set<Character> alphabets = new HashSet<>();
    
        for(int i = 0; i < n; i++) {
            char c = sentence.charAt(i);
            if(!alphabets.contains(c)) {
                alphabets.add(c);
            }
        }
        
        return alphabets.size() == 26;
    }
}