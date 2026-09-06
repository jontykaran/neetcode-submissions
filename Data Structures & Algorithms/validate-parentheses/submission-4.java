class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        boolean result = true;
        for(Character c: s.toCharArray()){
            if(c == '('){
                st.push(')');
            } else if(c == '{'){
                st.push('}');
            } else if(c == '['){
                st.push(']');
            } else {
                if(st.isEmpty()){
                    return false;
                } else {
                    result = result && (st.pop() == c);
                }
            }
        }
        return result && st.isEmpty();
        
    }
}
