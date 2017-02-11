public class Solution {
    public int[] intersection(int[] num1, int[] num2) {
        Set<Integer> hs = new HashSet<>();
        Set<Integer> hs2 = new HashSet<>();
        for(int i=0;i<num1.length;i++){
            hs.add(num1[i]);
        }
        
        for(int i=0;i<num2.length;i++){
            if(hs.contains(num2[i]))
                hs2.add(num2[i]);
        }
        
        int[] ret = new int[hs2.size()];
        int i=0;
        for (Integer temp:hs2)
        {
            ret[i++] = temp;
        }
        return ret;
    }
}    