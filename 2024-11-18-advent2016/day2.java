import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class day2 {
  public static String solver(String filename) {
    try {
      File f1 = new File(filename);
      Scanner input = new Scanner(f1);
      String passcode = "";
      int digit = 5;

      while(input.hasNextLine()) {
        String line = input.nextLine();
        // System.out.println(line);
        for (int i = 0; i < line.length(); i++) {
          // System.out.println(line.substring(i, i + 1));
          if (line.substring(i, i + 1).equals("L")) {
            if (digit % 3 != 1) {
              digit--;
            }
          }
          if (line.substring(i, i + 1).equals("R")) {
            if (digit % 3 != 0) {
              digit++;
            }
          }
          if (line.substring(i, i + 1).equals("U")) {
            if (digit >= 4) {
              digit -= 3;
            }
          }
          if (line.substring(i, i + 1).equals("D")) {
            if (digit <= 6) {
              digit +=3;
            }
          }
        }
        // System.out.println(digit);
        passcode += Integer.toString(digit);
      }

      input.close();
      return passcode;
    }
    catch (FileNotFoundException ex) {
      System.out.println("FIle not found");
      return "null";
    }
  }

  public static void main (String[] args) {
    System.out.println(solver("day2input.txt"));
  }
}
