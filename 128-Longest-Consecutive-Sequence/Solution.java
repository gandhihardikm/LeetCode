public class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int max=0;
        for(int i=0;i<nums.length;i++) set.add(nums[i]);
        
        for(int i=0;i<nums.length;i++){
            int value = nums[i];
            if(!set.contains(value-1)){
                int temp = value;
                while(set.contains(temp))
                    temp++;
                if(max < (temp-value))
                    max = temp-value;
            }
        }
        return max;
    }
}