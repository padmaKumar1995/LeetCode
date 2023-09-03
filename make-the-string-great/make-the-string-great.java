class Solution {
    public String makeGood(String s) {
        Stack<Character> st = new Stack<Character>();
        
        for(char c: s.toCharArray()) {
            if(st.empty()) {
                st.push(c);
            }
            else {
                int diff = Math.abs((int)(st.peek()) - (int)(c));
                
                if(diff != 32) {
                    st.push(c);
                }
                else {
                    st.pop();
                }
            }
        }
        
        StringBuilder sb = new StringBuilder();
        while(!st.empty()) {
            sb.append(st.pop());
        }
        
        sb.reverse();
        
        return sb.toString();
    }
}