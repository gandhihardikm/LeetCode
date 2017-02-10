public class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] range = {0,0};
        if(nums.length == 1 && nums[0] == target)
            return range;
            
        int[] range1 = {-1,-1};
        int index=0;
        if((index = search(nums,0,nums.length,target)) == -1)
            return range1;
        
        int low=index;
        int high=index;
        while(low >0 && nums[low-1] == target)
            low--;
            
        while(high < nums.length-1 && nums[high+1] == target)    
            high++;
            
        range[0] = low;
        range[1] = high;
        return range;
    }
    
    public int search(int[] nums,int low, int high, int target){
        if(low < high){
            int mid = (low+high)/2;
            
            if(nums[mid] == target)
                return mid;
            else if(nums[mid] < target)
                return search(nums,mid+1,high,target);
            else
                return search(nums,low,mid,target);
        }
        return -1;
    }
}