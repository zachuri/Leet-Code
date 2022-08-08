class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
		// Check if current color is equal with the current row/column
        int currColor = image[sr][sc];
		if (currColor != color) {
            dfs(image, sr, sc, currColor, color);
		}
        return image;
    }
    public void dfs(int[][] image, int r, int c, int currColor, int color) {
        
		// return = break
		
		// Check out of bounds
        if (r < 0 ) { return; } 
        if (c < 0) { return; }

		// check rows
        if (r >= image.length) { return; }

		// check check columns
        if (c >= image[0].length) { return; }
        if (image[r][c] != currColor) { return; }
        
		//the current change the color
        image[r][c] = color;
        dfs(image, r-1, c, currColor, color);
        dfs(image, r, c-1, currColor, color);
        dfs(image, r+1, c, currColor, color);
        dfs(image, r, c+1, currColor, color);
    }
}


