public class Solution {
    public void nextPermutation(int[] nums) {
        if(nums.length <= 1)
            return;
        boolean swapPlace = false;
        int i=0;
        for(i=nums.length-1;i>0;i--){
            if(nums[i-1] < nums[i]){
                swapPlace = true;
                break;
            }
        }
        if(swapPlace == true){
            int numberToCompare = nums[i-1];
            int smallestIndex = i;
            for(int j=i;j<nums.length;j++){
                if(nums[j] > numberToCompare && nums[j] < nums[smallestIndex]){
                    smallestIndex = j;
                }
            }
            nums[i-1] = nums[i-1] ^ nums[smallestIndex] ^ (nums[smallestIndex] = nums[i-1]);
            Arrays.sort(nums,i,nums.length);
        }else{
            Arrays.sort(nums);
        }
        
    }
}