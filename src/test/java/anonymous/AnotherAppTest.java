package anonymous;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

import anonymous.App;

@RunWith(junitparams.JUnitParamsRunner.class)
public class AnotherAppTest {
  public AnotherAppTest() {}

  @Test 
  @Parameters({"1,2", "-1,2"})
  public void t1(int a, int b) 
  { 
      if (a > 0)
          assertTrue(App.m(a, b) == a+b);
      else
          assertTrue(App.m(a, b) == a*a*b*b);
  }
}
