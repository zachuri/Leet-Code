class Solution {
  // MAX Possible distance
  private static final int MAX_DISTANCE = 10000;      

  public int[][] updateMatrix(int[][] mat) {
    // init matrix rows anc cols
    int m = mat.length, n = mat[0].length;

    // init distance matrix
    int[][] distance = new int[m][n];

    // fill distance matrix with max_distance
    for (int i = 0; i < m; ++i) {
      Arrays.fill(distance[i], MAX_DISTANCE);
    }

    // checks above and left cells
    for (int r = 0; r < m; ++r) {
      for (int c = 0; c < n; ++c) {
        // set distance matrix to 0 if mat is 0
        if (mat[r][c] == 0) {
          distance[r][c] = 0; 
          continue;
        }

        // find min distance of above cells
        if (r > 0) {
          distance[r][c] = Math.min(distance[r][c], distance[r - 1][c] + 1);
        }

        // find min distance of left cells
        if (c > 0) {
          distance[r][c] = Math.min(distance[r][c], distance[r][c - 1] + 1);
        }
      }
    }

    // checks below and right cells
    for (int r = m - 1; r >= 0; --r) {
      for (int c = n - 1; c >= 0; --c) {
        // find min distance of below cells
        if (r < m - 1) {
          distance[r][c] = Math.min(distance[r][c], distance[r + 1][c] + 1);
        }

        // find min distance of right cells
        if (c < n - 1) {
          distance[r][c] = Math.min(distance[r][c], distance[r][c + 1] + 1);
        }
      }
    }

    return distance;
  }
}