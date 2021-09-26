import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestJunit {
  @Test
  public void testAdd() {
    NumbersRiddle test = new NumbersRiddle();
    assertEquals(3, test.evaluate(0));
    assertEquals(3, test.evaluate(9));
    assertEquals(3, test.evaluate(10));
    assertEquals(3, test.evaluate(21));
  } // testAdd method
} // TestJunit class