package anonymous;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Collection;

import com.pholser.junit.quickcheck.From;
import org.junit.Test;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.Parameter;
import anonymous.App;
import anonymous.Con;
import anonymous.ConGenerator;

@RunWith(Parameterized.class)
public class AppTest {

  @Parameter(0)
  @From(ConGenerator.class)
  public Con a;

  @Parameter(1)
  public int b;
  
  @Parameters
  public static Collection params() {
      return Arrays.asList(new Object[][] {
          {new Con(1), 2},
          {new Con(-1), 2}
      });
  }
  
  public AppTest() {}

  @Test 
  public void t2() 
  { 
      if (a.key > 0)
          assertTrue(App.m(a.key, b) == a.key+b);
      else
          assertTrue(App.m(a.key, b) == a.key*a.key*b*b);
  }


}
