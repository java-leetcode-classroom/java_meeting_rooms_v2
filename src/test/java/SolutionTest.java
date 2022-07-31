import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
  final private Solution sol = new Solution();
  @Test
  void minMeetingRoomsExamples1() {
    assertEquals(2, sol.minMeetingRooms(List.of(
        new Interval(0, 30),
        new Interval(5, 10),
        new Interval(15, 20)
    )));
  }
  @Test
  void minMeetingRoomsExamples2() {
    assertEquals(1, sol.minMeetingRooms(List.of(
        new Interval(2, 7)
    )));
  }
}