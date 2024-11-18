import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class day1 {

  public static int part1 (String filename) {
    try {
      int distance = 0;
      File f1 = new File (filename);
      Scanner input = new Scanner(f1);
      while (input.hasNext)
      String[] moves = input.split(",");
      System.out.println(moves.toString());
      input.close();
      return distance;
    }
    catch (FileNotFoundException ex) {
      System.out.println("File not found!");
      return -1;
    }
  }

  public static void main (String[] args) {
    System.out.println(part1("day1input.txt"));
  }
}
