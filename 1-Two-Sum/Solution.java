public class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],i);
        }
        int selfIndex = 0;
        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(target-nums[i]) && (i != hm.get(target-nums[i]))){
                int[] result_array = new int[2];
                result_array[0] = i;
                result_array[1] = hm.get(target-nums[i]);
                return result_array;
            }
        }
        return new int[0];
        
    }
}