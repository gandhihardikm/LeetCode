public class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int temp=0;
        for(int i=0;i<nums.length;i++){
            temp = Math.abs(nums[i])-1;
            if(nums[temp] > 0)
                nums[temp] = -nums[temp];
        }
        List<Integer> result = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0)
                result.add(i+1);
        }
        return result;
    }
}