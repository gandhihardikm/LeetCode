public class Solution {
    public int uniquePaths(int m, int n) {
        int count=0;
        int[][] arr = new int[m][n];
        arr[m-1][n-1] = 1;
        count = findPaths(0,0,arr,m,n);
        return count;
    }
    
    public int findPaths(int right,int bottom,int arr[][],int m,int n){
        if(right >= m || bottom >= n)
            return 0;
        if(arr[right][bottom] != 0)
            return arr[right][bottom];
        
        arr[right][bottom] = findPaths(right+1,bottom,arr,m,n)+findPaths(right,bottom+1,arr,m,n);
        
        return arr[right][bottom];
    }
}