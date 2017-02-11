public class Solution{
	public boolean isIsomorphic(String s1,String s2){

		int[] map = new int[512];

		for(int i=0;i<s1.length;i++){
			if(map[s1.charAt(i)] != map[s2.charAt(i)+256]) return false;
			map[s1.charAt(i)] = map[s2.charAt(i)+256] = i+1;
		}
		return true;
	}
}