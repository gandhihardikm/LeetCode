public class Solution {
    public boolean wordPattern(String pattern, String str) {
        HashMap<Character,String> hm = new HashMap();
        String[] temp = str.split(" ");
        if(temp.length != pattern.length())
            return false;
        
        for(int i=0;i<pattern.length();i++){
            if(hm.containsKey(pattern.charAt(i))){
                if(!hm.get(pattern.charAt(i)).equals(temp[i]))
                    return false;
            }else{
                if(hm.containsValue(temp[i]))
                    return false;
                hm.put(pattern.charAt(i),temp[i]);    
            }
        }
        
        return true;
        
    }
}