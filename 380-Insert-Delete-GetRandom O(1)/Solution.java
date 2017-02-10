public class RandomizedSet {
    private HashMap<Integer,Integer> hm;
    private ArrayList<Integer> al;
    /** Initialize your data structure here. */
    public RandomizedSet() {
        hm = new HashMap<Integer,Integer>();
        al = new ArrayList<>();
    }
    
    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        if(!hm.containsKey(val)){
            hm.put(val,al.size());
            al.add(val);
            return true;
        }
        return false;
    }
    
    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        if(hm.containsKey(val)){
            int value = hm.get(val);
            int lastElement = al.get(al.size()-1);
            hm.put(lastElement, value);
            al.set(value,lastElement);
            hm.remove(val);
            al.remove(al.size()-1);
            return true;
        }    
        return false;
    }
    
    /** Get a random element from the set. */
    public int getRandom() {
        Random random = new Random();
        return al.get(random.nextInt(hm.size()));    
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */