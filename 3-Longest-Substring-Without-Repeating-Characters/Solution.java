public class Solution {
    
        
      public static int lengthOfLongestSubstring(String s) {
        String temp = "";
        int maxLength = 0;
        int index = 0;
        
        for(int i = 0; i < s.length(); i++) {
            
            index = temp.indexOf(s.charAt(i));
            System.out.println(index + " "+ temp.substring(index+1) + " "+ s.charAt(i));
            temp = temp.substring(index + 1) + s.charAt(i);
            maxLength = Math.max(temp.length(), maxLength);
        }
        return maxLength;
      }
}