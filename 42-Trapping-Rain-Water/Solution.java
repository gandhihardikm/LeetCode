public class Solution {
    public int trap(int[] height) {
        
        Stack<Integer> s = new Stack<Integer>();
        int maxWater = 0;
        int water=0;
        for(int i=0;i<height.length;){
            if(s.isEmpty() || height[s.peek()]>=height[i])
                s.push(i++);
            else{
                int center = s.pop();
                water += s.isEmpty() ? 0 : (Math.min(height[s.peek()],height[i])-height[center])*(i-s.peek()-1);
            }
        }
        return water;
    }
}