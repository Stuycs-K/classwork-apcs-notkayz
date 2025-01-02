public class fibTest {
  public static int fib(int n) {
    int sum = 0;
    if (n <= 2) {
      if (n == 0) {
        return 0;
      }
      return 1;
    }
    else {
      sum += (fib(n - 1) + fib(n - 2));
    }
    return sum;
  }

  public static void main(String[] args) {
    for (int i = 0; i < 6; i++) {
      System.out.println(fib(i));
    }
  }
}
