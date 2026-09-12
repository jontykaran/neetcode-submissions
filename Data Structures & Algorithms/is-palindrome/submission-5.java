class Solution {
    public boolean isPalindrome(String s) {
        int f = 0;
        int l = s.length()-1;

        while(f < l){
            while(!isCharAlphaNumeric(s.charAt(f)) && (f < l)){
                f++;
            } 
            
            while(!isCharAlphaNumeric(s.charAt(l)) && f<l){
                l--;
            }
            if(Character.toLowerCase(s.charAt(f)) != Character.toLowerCase(s.charAt(l))){
                return false;
            }
            f++;
            l--;
        }
        return true;
    }

    public boolean isCharAlphaNumeric(Character ch){
        if ((ch >= 'a' && ch <= 'z') ||
                (ch >= 'A' && ch <= 'Z') ||
                (ch >= '0' && ch <= '9')) {
            // ch is an ASCII letter or digit
            return true;
        }
        return false;
    }
}
