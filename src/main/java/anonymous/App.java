package anonymous;

public class App {
  public App() {}
  public static int m(int a, int b) {
    if (a > 0) { 
        return a + b; 
    }
    else { 
        int c = a * b; 
        return c * c; 
    }
  }
  public static int p(int x, int y) 
  {
      if (x > y) {
          return x * y;
      }
      else {
          x++;
          return x + y;
      }
  }
}
