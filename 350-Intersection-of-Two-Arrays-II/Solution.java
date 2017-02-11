public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        if(nums1.length == 0 || nums2.length == 0){
            return new int[0];
        }
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> al = new ArrayList<Integer>();
        int i=0;
        int j=0;
        while(i< nums1.length && j<nums2.length){
            if(nums1[i] < nums2[j])i++;
            else if(nums1[i] > nums2[j])j++;
            else{
                al.add(nums1[i]);
                i++;j++;
            }    
        }
        int[] a = new int[al.size()];
        for(i=0;i<al.size();i++){
            a[i] = al.get(i);
        }
        return a;
    }
}