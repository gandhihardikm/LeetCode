public class Solution {
    public int removeDuplicates(int[] nums) {
        int count =1;
        int index=0;
        for(int i=1;i<nums.length;i++){
            if(nums[index] == nums[i] && count < 2){
                nums[++index] = nums[i];
                count++;
                continue;
            }
            if(nums[index] != nums[i]){
                nums[++index] = nums[i];
                count=1;
            }
        }
        
        return index+1;
    }
}