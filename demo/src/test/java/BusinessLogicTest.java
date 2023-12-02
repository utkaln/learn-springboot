import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BusinessLogicTest {
  private BusinessLogic busLog = new BusinessLogic();

  @BeforeAll
  // This method will execute at the beginning once, must be a static method
  static void testBeforeAll() {
    System.out.println("Before All |-- ...");
  }

  @BeforeEach
  void testBeforeEach() {
    System.out.println("Before Each |-->");
  }

  @AfterEach
  void testAfterEach() {
    System.out.println("After Each <--|");
  }

  @AfterAll
  static void testAfterAll() {
    System.out.println("After All ... --|");
  }

  @Test
  void testSumOfNumbers() {
    assertEquals(6, busLog.sumOfNumbers(new int[] { 1, 2, 3 }));
  }

  @Test
  void testNullValue() {
    assertEquals(0, busLog.sumOfNumbers(null));
  }

  @Test
  void testEmptyValue() {
    assertEquals(0, busLog.sumOfNumbers(new int[] {}));
  }
}
