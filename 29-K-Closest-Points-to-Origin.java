import java.util.PriorityQueue;

class Solution {
  public int[][] kClosest(int[][] points, int k) {
    // last part of PriorityQueue is a lambda comparator 
    // takes two arrays and compares
    // sorts points by their distance to the origin in descending order (closest points first):
    PriorityQueue<int[]> pq = new PriorityQueue<>((o1, o2) -> getDistance(o2) - getDistance(o1));       

    for (int [] point : points) {
      pq.add(point);

      if (pq.size() > k) {
        pq.poll();
      }
    }

    int[][] result = new int[pq.size()][2];

    for (int i = 0; i < result.length; i++) {
      result[i] = pq.poll();
    }

    return result;
  }

  private int getDistance(int[] point) {
    return (point[0] * point[0]) + (point[1] * point[1]);
  }

  public int[][] kClosest(int[][] points, int k) {
    PriorityQueue pq = new PriorityQueue<>((o1, o2) -> getDistance(o2) - getDistance(o1));


    for (int[] point : points) {
      pq.add(point);

      if (pq.size() > k) {
        pq.poll();
      }
    }

    int[][] result = new int[pq.size()][2];

    for (int i = 0; i < result.length; i++) {
      result[i] = pq.poll();
    }

    return result;
  }

  private int getDistance(int[] point) {
    return (point[0] * point[0]) + (point[1] + point[1]); 
  }
}