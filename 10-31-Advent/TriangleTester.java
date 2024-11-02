import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TriangleTester {

  public static int countTrianglesA(String filename) {
    try {
      int res = 0;
      File file = new File(filename);
      Scanner input = new Scanner(file);
      
      while (input.hasNextLine()) {
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        if (isTriangle(a, b, c)) {
          res++;
        }
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

  public static void main(String[] args) {
    // test cases for isTriangle
    System.out.println(isTriangle(5, 10, 25));
    System.out.println(isTriangle(5, 100, 5));
    System.out.println(isTriangle(3, 4, 5));
    System.out.println(isTriangle(1, 1, 1));
    System.out.println(countTrianglesA("inputTri.txt"));
  }
}
