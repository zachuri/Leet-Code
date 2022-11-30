class Solution {
  public int[][] floodFill(int[][] image, int sr, int sc, int color) {
    //Check if current color is equal with the current row/col
    int currColor = image[sr][sc];

    // base case
    if (currColor != color) {
      dfs(image, sr, sc, currColor, color);
    }
    return image;
  }

  public void dfs(int[][] image, int r, int c, int currColor, int color) {
    // ex. currColor = 1, Change color = 2

    // Check out of bounds
    if (r < 0) { return; }
    if (c < 0) { return; }
    if (r >= image.length) { return; }
    if (c >=image[0].length) { return; }

    // Check current color
    if (image[r][c] != currColor) { return; }

    image[r][c] = color;
    dfs(image, r-1, c, currColor, color);
    dfs(image, r, c-1, currColor, color);
    dfs(image, r+1, c, currColor, color);
    dfs(image, r, c+1, currColor, color);
  }
}