public class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        Arrays.sort(candidates);
        combineSum(result,new ArrayList<Integer>(), candidates, target,0);
        return result;
    }
    
    public void combineSum(List<List<Integer>> result,List<Integer> item,int[] candidates,int remain, int start){
        if(remain < 0) return;
        else if(remain == 0){
            result.add(new ArrayList<Integer>(item));
            return;
        }else{
            for(int i=start;i<candidates.length;i++){
                item.add(candidates[i]);
                combineSum(result,item,candidates,remain-candidates[i],i);
                item.remove(item.size()-1);
            }
        }
        
    }
}