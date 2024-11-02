import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TriangleTester {
  public static void main(String[] args) {

  }

  public static int countTrianglesA(String filename) {
    int res = 0;
    try {
      File file = new File(filename);
      Scanner input = new Scanner(file);
      while (input.hasNextLine()) {
        if (isTriangle(input.nextDouble(), input.nextDouble(), input.nextDouble()))
          res++;
      }
      input.close();
      return res;
    } catch (FileNotFoundException e) {
      System.out.println("File not found");
      return -1;
    }
  }

  public static boolean isTriangle(double a, double b, double c) {
    if (a + b > c && b + c > a && c + a > b) {
      return true;
    }
    return false;
  }
}
