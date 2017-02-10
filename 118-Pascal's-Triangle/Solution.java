public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> output = new ArrayList<>();
        
        for(int i=0;i<numRows;i++){
            List<Integer> subList = new ArrayList<Integer>();
            
            for(int j=0;j<=i;j++){
                if(j==0 || j == i)
                    subList.add(1);
                else{
                    subList.add(output.get(output.size()-1).get(j-1)+output.get(output.size()-1).get(j));
                }    
            }
            
            output.add(subList);
            
        }
        return output;     
    }
}