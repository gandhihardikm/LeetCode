public class Solution {
    public int largestRectangleArea(int[] height) {
        int len = height.length;
        Stack<Integer> s = new Stack<Integer>();
        int maxArea = 0;
        for(int i = 0; i <= len; i++){
            System.out.println("i="+i);
            int h = (i == len ? 0 : height[i]);
            if(s.isEmpty() || h >= height[s.peek()]){
                s.push(i);
            }else{
                int tp = s.pop();
                int temp = height[tp] * (s.isEmpty() ? i : i - 1 - s.peek());
                System.out.println(temp);
                maxArea = Math.max(maxArea, temp);
                i--;
            }
        }
        return maxArea;
    }
}

