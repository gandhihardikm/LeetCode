public class Solution {
    private int column,row;
    public int islandPerimeter(int[][] grid) {
        column = grid[0].length;
        row = grid.length;
        boolean[][] grid1 = new boolean[row][column];
        return calculatePerimeter(grid,0,0,grid1);
    }
    
    public int calculatePerimeter(int[][] grid, int r, int c,boolean[][] grid1){
        int sum=0;
        if(r == row || c == column || grid1[r][c] == true){
            return sum;
        }
        
        if(grid[r][c] == 1){
            if(r-1 == -1 || grid[r-1][c] == 0)
                sum++;
        
            if(c-1 == -1 || grid[r][c-1] == 0)        
                sum++;
    
            if(r+1 >= row || grid[r+1][c] == 0)
                sum++;
    
            if(c+1 >= column || grid[r][c+1] == 0)
                sum++;
        }

        grid1[r][c] = true;
        return sum + calculatePerimeter(grid,r,c+1,grid1)+calculatePerimeter(grid,r+1,c,grid1);
        
    }
}