public class Solution {
    public int countPrimes(int n) {
        
      boolean[] m = new boolean[n];
        int count = 0;
        for (int i=2; i<n; i++) {
            if (m[i])
                continue;
             
            count++;
            
            for (int j=2*i; j<n; j=j+i)
                m[j] = true;
        }
         
        return count;
    
    }
}