public class Solution {
    public String frequencySort(String s) {
        if(s.length() < 3)
            return s;
        int max = 0;
        int[] map = new int[256];
        for(char ch : s.toCharArray()) {
            map[ch]++;
            max = Math.max(max,map[ch]);
        }
        String[] buckets = new String[max + 1]; // create max buckets
        for(int i = 0 ; i < 256; i++) { // join chars in the same bucket
            String str = buckets[map[i]];
            if(map[i] > 0)
                buckets[map[i]] = (str == null) ? "" + (char)i : (str + (char) i);
        }
        
        for(int i=0;i<buckets.length;i++)
            System.out.println(buckets[i]);
            
        StringBuilder strb = new StringBuilder();
        for(int i = max; i >= 0; i--) { // create string for each bucket.
            if(buckets[i] != null)
                for(char ch : buckets[i].toCharArray())
                    for(int j = 0; j < i; j++)
                        strb.append(ch);
        }
        return strb.toString();
    }
    
    
    /*public String frequencySort(String s) {
        HashMap<Character,Integer> hm = new HashMap<>();
        
        for(int i=0;i<s.length();i++){
            if(hm.containsKey(s.charAt(i)))
                hm.put(s.charAt(i),hm.get(s.charAt(i))+1);
            else
                hm.put(s.charAt(i),1);
        }
       
        Map<Character,Integer> sortedhm = sortByValue(hm);
       
        StringBuilder sb = new StringBuilder();
        for(Map.Entry<Character,Integer> ent:sortedhm.entrySet()){
            int i=0;
            while(i<ent.getValue()){
                sb.append(ent.getKey());
                i++;
            }        
        }
                
        return sb.toString();
        
    }
    private Map<Character,Integer> sortByValue(Map<Character,Integer> unsortedhm){
        List<Map.Entry<Character,Integer>> list = new LinkedList<Map.Entry<Character,Integer>>(unsortedhm.entrySet());
        
        Collections.sort(list, new Comparator<Map.Entry<Character,Integer>>(){
            public int compare(Map.Entry<Character,Integer> o1, Map.Entry<Character,Integer> o2){
                return o2.getValue() - o1.getValue();
            } 
        });
        
        Map<Character,Integer> sortedMap = new LinkedHashMap<Character,Integer>();
        for(Map.Entry<Character,Integer> e: list){
            sortedMap.put(e.getKey(),e.getValue());
        }
        return sortedMap;
    }*/
}