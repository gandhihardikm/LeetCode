public class Solution {
    public void rotate(int[] nums, int k) {
        
        k = k%nums.length;
        int[] num1 = new int[nums.length];
        int startIndex = (nums.length-k)%nums.length;
        for(int j=0;j<nums.length;j++){
            num1[j] = nums[startIndex];
            startIndex++;
            if(startIndex == nums.length)
                startIndex=0;
        }
        
        for(int i=0;i<nums.length;i++)
            nums[i] = num1[i];
        
    }
}