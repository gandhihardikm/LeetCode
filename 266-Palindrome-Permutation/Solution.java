public class Solution {
    public boolean canPermutePalindrome(String s) {
        
        int[] buffer = new int[256];
        int oddOccurence=0;
        for(int i=0;i<s.length();i++){
            int x = (int)s.charAt(i);
            buffer[x]++;
            
            if(buffer[x] % 2 == 1)
                oddOccurence++;
            else
                oddOccurence--;
        }
        
        return (oddOccurence <= 1)?true:false;
        
    }
}