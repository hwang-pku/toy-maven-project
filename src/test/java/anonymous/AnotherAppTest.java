package anonymous;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import anonymous.App;

public class AnotherAppTest {
  public AnotherAppTest() {}

  @Test 
  public void t1() 
  { 
      assertTrue(App.m(1, 2) == 3);
  }
}
