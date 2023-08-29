class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> freq = new HashMap<>();
        
        for(int i = 0; i < ransomNote.length(); i++){
            if(freq.containsKey(ransomNote.charAt(i))){
                int val = freq.get(ransomNote.charAt(i)) + 1;
                freq.put(ransomNote.charAt(i), val);
            }
            else{
                freq.put(ransomNote.charAt(i), 1);
            }
        }
        
        for(int i = 0; i < magazine.length(); i++){
            if(freq.containsKey(magazine.charAt(i))){
                int val = freq.get(magazine.charAt(i)) - 1;
                if(val == 0){
                    freq.remove(magazine.charAt(i));
                }
                else{
                    freq.put(magazine.charAt(i), val);
                }
            }
        }
        
        return freq.isEmpty();
    }
}