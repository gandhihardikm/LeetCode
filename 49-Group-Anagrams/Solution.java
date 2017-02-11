public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String,List<String>> map = new HashMap<>();
        
        for(String str:strs){
            char[] c = str.toCharArray();
            Arrays.sort(c);
            if(map.containsKey(String.valueOf(c))){
                map.get(String.valueOf(c)).add(str);
            }else{
                List<String> list = new ArrayList<>();
                list.add(str);
                map.put(String.valueOf(c),list);
            }
        }
        
        return new ArrayList<List<String>>(map.values());
    }
}