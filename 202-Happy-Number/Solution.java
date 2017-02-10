public class Solution {
    public boolean isHappy(int n) {
        
        HashSet<Integer> hs = new HashSet<Integer>();
        
        while(n != 1){
            int sum=0;
            while(n != 0){
                int reminder = n%10;
                sum = sum + reminder*reminder;
                n = n/10;
            }
            if(hs.contains(sum))
                return false;    
                
            hs.add(sum);    
            n = sum;
        }
        return true;
    }    
}