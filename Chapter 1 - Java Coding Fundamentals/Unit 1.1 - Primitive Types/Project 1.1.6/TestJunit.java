import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestJunit {
  @Test
  public void testAdd() {
    NumbersRiddle test = new NumbersRiddle();
    assertEquals(3, test.evaluate());
    assertEquals(3, test.evaluate());
    assertEquals(3, test.evaluate());
    assertEquals(3, test.evaluate());
  } // testAdd method
} // TestJunit class