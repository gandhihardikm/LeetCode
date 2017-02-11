
public class Solution {
    public char findTheDifference(String s, String t) {
        HashMap<Character,Integer> m = new HashMap<Character,Integer>();
        char[] first = s.toCharArray();
        char[] second = t.toCharArray();
        int cnt=0;
        
        for(int i=0;i<first.length;i++){
            if(m.containsKey(first[i])){
                cnt = m.get(first[i]);
                m.put(first[i],++cnt);
            }else{
                m.put(first[i],1);    
            }
        }
        
        int i=0;
        for(;i<second.length;i++){
            if(m.containsKey(second[i]) && m.get(second[i]) > 0){
                cnt = m.get(second[i]);
                m.put(second[i],--cnt);
            }else{
                break;
            }
            
        }
        
        return second[i];
    }
}