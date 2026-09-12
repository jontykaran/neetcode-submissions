class Solution {
    public int largestRectangleArea(int[] heights) {

        int n = heights.length;
        int maxA = 0;

        Deque<Integer> st = new ArrayDeque<>();

        for(int i =0; i<=n; i++){
            int currentH = (i == n) ? 0 : heights[i];

            while( !st.isEmpty() && heights[st.peek()] > currentH){
                int index = st.pop();
                int popH = heights[index];
                int width = (st.isEmpty()) ? i : i-st.peek()-1;

                maxA = Math.max(maxA, popH*width);
            }
            st.push(i);
        }
        return maxA;
    }

}