public class Solution {
    public int longestPalindrome(String s) {
        
        char[] lowerCaseStorage = new char[26];
        char[] upperCaseStorage = new char[26];
        if(s.length() == 0)
            return 0;
            
        for(int i=0;i<s.length();i++){
            if(Character.isLowerCase(s.charAt(i))){
                lowerCaseStorage[s.charAt(i) - 'a']++;
            }
            else{
                upperCaseStorage[s.charAt(i) - 'A']++;
            }
        }
        int output = 0;
        for(int i=0;i<26;i++){
            if(lowerCaseStorage[i] % 2 == 0){
                output += lowerCaseStorage[i];
            }else{
                output += lowerCaseStorage[i] - 1;
            }
            if(upperCaseStorage[i] % 2 == 0){
                output += upperCaseStorage[i];
            }else{
                output += upperCaseStorage[i] - 1;
            }
        }
        return output==s.length() ? output : output+1;
    }
}