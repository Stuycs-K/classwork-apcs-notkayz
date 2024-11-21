import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class day6 {
  public static void main (String[] args ) {
    System.out.println(solver("day6input.txt"));
  }
  public static String solver(String filename) {
    try {
      File f1 = new File(filename);
      Scanner input = new Scanner(f1);
      String message = "";

      
      input.close();
      return message;
    }
    catch (FileNotFoundException ex) {
      System.out.println("File not found");
      return "";
    }
  }
}
