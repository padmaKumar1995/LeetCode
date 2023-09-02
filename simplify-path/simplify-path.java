class Solution {
    public String simplifyPath(String path) {
        String[] sarr = path.split("/");
        Stack<String> st = new Stack<String>();
        
        for(String s: sarr) {
            if(Objects.equals(s, "..")) {
                if(!st.empty()) {
                    st.pop();
                }
            }
            else if(!Objects.equals(s, ".") && !Objects.equals(s, "")) {
                st.push(s);
            }
        }
        
        StringBuilder sb = new StringBuilder();
        while(!st.empty()) {
            sb.insert(0, "/" + st.pop());
        }

        return sb.toString() == "" ? "/" : sb.toString();
    }
}