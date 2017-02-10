public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int j=m+n-1;
        for(int i=m-1;i>=0;j--,i--){
            nums1[j] = nums1[i];
        }
        j++;
        int i=0,k=0;
        if(m == 0){
            while(k<n){
                nums1[i++] = nums2[k++];
            }
            return;
        }
        
        
        while(k<n && j<m+n){
            if(nums1[j] > nums2[k]){
                nums1[i++] = nums2[k++];
            }
            else{
                nums1[i++] = nums1[j++];
            }
        }
       
        while(k<n){
            nums1[i++] = nums2[k++];
        }
        while(j<m+n){
            nums1[i++] = nums1[j++];
        }
        
    }
}