import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {
  public static void main() {
    Result result = JUnitCore.runClasses(TestJunit.class);
    
    for (Failure failure : result.getFailures()) {
      System.out.println(failure.toString());
    }

    if (result.wasSuccessful()) {
      System.out.println("\nTests results were successful");
    }
    else {
      System.out.println("\nTests were not successful");
    }
  } // main method
} // TestRunner class