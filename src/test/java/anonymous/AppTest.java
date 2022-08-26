package anonymous;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.Parameter;
import anonymous.App;

@RunWith(Parameterized.class)
public class AppTest {

  @Parameter(0)
  public int a;
  @Parameter(1)
  public int b;
  
  @Parameters
  public static Collection params() {
      return Arrays.asList(new Object[][] {
          {1, 2},
          {-1, 2}
      });
  }
  
  public AppTest() {}

  @Test 
  public void t2() 
  { 
      if (a > 0)
          assertTrue(App.m(a, b) == a+b);
      else
          assertTrue(App.m(a, b) == a*a*b*b);
  }

  @Test 
  public void t1() 
  { 
  }

  @Test 
  public void t3() 
  { 
      while(true){}
  }
}
