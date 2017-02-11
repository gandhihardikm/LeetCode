public class Solution {
    public List<List<String>> groupStrings(String[] strings) {
        List<List<String>> result = new ArrayList<List<String>>();
        HashMap<String,ArrayList<String>> hm = new HashMap<>();
        
        for(String str:strings){
            int offset = str.charAt(0) - 'a';
            String key = "";
            for(int i=0;i<str.length();i++){
                char c = (char) (str.charAt(i) - offset);
                if(c < 'a'){
                    c += 26;
                }
                key += c;
            }
            if(!hm.containsKey(key)){
                ArrayList<String> list = new ArrayList<>();
                hm.put(key,list);
            }
            hm.get(key).add(str);
        }
        
        for (String str : hm.keySet()) {
            ArrayList<String> al = hm.get(str);
            //Collections.sort(al);
            result.add(al);
        }
        
        return result;
        
    }
}