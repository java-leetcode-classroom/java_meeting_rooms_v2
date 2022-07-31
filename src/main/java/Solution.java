import java.util.Arrays;
import java.util.List;

public class Solution {
/**
 * Definition of Interval:
 * public class Interval {
 *     int start, end;
 *     Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */
  /**
   * @param intervals: an array of meeting time intervals
   * @return: the minimum number of conference rooms required
   */
  public int minMeetingRooms(List<Interval> intervals) {
    int count = 0, result = 0;
    int n = intervals.size();
    int[] start = new int[n], end = new int[n];
    for (int pos = 0; pos < n; pos++) {
      Interval cur = intervals.get(pos);
      start[pos] = cur.start;
      end[pos] = cur.end;
    }
    Arrays.sort(start);
    Arrays.sort(end);
    int pStart = 0, pEnd = 0;
    while (pStart < n) {
      if (start[pStart] < end[pEnd]) {
        count++;
        pStart++;
      } else {
        count--;
        pEnd++;
      }
      result = Math.max(result, count);
    }
    return result;
  }
}
