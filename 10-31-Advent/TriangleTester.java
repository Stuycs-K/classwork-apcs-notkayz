import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TriangleTester {
  public static void main(String[] args) {

  }

  public static int countTrianglesA(String filename) {
    int res = 0;
    while (filename.hasNextLine())
    {
      if (isTriangle(filename.nextDouble(), filename.nextDouble(), filename.nextDouble()))res++;
    }
    return res;
  }
  public static boolean isTriangle(double A, double B, double C){
    if (A+B > C && B+C > A && C+A > B)return true;
    return false;
  }
}
