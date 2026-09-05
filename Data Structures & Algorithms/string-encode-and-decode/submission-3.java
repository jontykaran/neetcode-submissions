class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder(); 
        for(int i=0; i<strs.size(); i++){
            sb.append(strs.get(i).length()).append("#").append(strs.get(i));
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int j = 0;
        int i = 0;
        while(i< str.length()){
            j=i;
            while(str.charAt(j) != '#'){
                j++;
            }
            // 2#hi
            // 0123
            // i = 0 
            // j = 1
            // strSub => j = length. 
            // i, length
            Integer length = Integer.parseInt(str.substring(i,j));
            result.add(str.substring(j+1, j + 1 + length));
            i = j + 1 + length;
        }
        return result;
    }
}
