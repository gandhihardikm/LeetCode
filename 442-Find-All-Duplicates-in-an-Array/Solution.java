public class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> output = new ArrayList<Integer>();
        int value;
        for(int i=0;i<nums.length;i++){
            value = Math.abs(nums[i])-1;
            if(nums[value] < 0){
                output.add(Math.abs(value+1));
            }
            nums[value] = nums[value] * -1;
        }
        return output;    
    }
}