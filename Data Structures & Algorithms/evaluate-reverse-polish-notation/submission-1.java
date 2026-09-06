class Solution {
    List<String> symbols = Arrays.asList("+", "-", "*", "/");
    Deque<Integer> stack = new ArrayDeque<>();

    public int evalRPN(String[] tokens) {
        for(String val : tokens){
            if(!symbols.contains(val)){
               stack.push(Integer.parseInt(val));
            } else {
                int v2 = stack.pop();
                int v1 = stack.pop();
                if(val.equals("+")){
                    v1 = v1 + v2;
                } else if( val.equals("-")){
                    v1 = v1 - v2;
                } else if(val.equals("*")){
                    v1 = v1 * v2;
                } else {
                    v1 = v1 / v2;
                }
                stack.push(v1);
            }
        }
        return stack.pop();

    }
}
