import java.util.List;

//  Look at this solution/explanaation
// https://www.youtube.com/watch?v=K7B9ZTKoRpQ

class Solution {
  public int[][] insert(int[][] intervals, int[] newInterval) {
    // define list
    List<int[]> list = new LinkedList<>();

    //1. add all intervals that are non-overllaping to the newInterval
    int i = 0, n = intervals.length;
    
    
    while (i < n && intervals[i][1] < newInterval[0]) {
      // checking curr Intervals end & new Interval start index  
      list.add(intervals[i++]);

    }

    //2. merge newInterval with the overlapping interval
    while (i < n && intervals[i][0] <= newInterval[1]) {
      newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
      newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
      i++;
    }
    list.add(newInterval);

    //3. add the remaining intervals onto the list
    while(i < n) {
      list.add(intervals[i++]);
    }

    // return list
    return list.toArray(new int[list.size()][2]);

  }
}