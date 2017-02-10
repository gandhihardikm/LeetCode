public class Solution {
    public int thirdMax(int[] nums) {
       
       PriorityQueue<Integer> queueObject = new PriorityQueue<>(nums.length);
       
       for(int i=0;i<nums.length;i++){
           if(!queueObject.contains(nums[i]))
                queueObject.add(nums[i]);
       }
       for(Integer a: queueObject){
            System.out.println(a);
       } 
       if(queueObject.size() >= 3){
           queueObject.poll();
           queueObject.poll();
       } 
       if(queueObject.size() == 2){
           return queueObject.poll();
       }
       return queueObject.poll();
    }
}