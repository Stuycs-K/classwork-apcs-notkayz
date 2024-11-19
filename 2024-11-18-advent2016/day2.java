import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class day2 {
  public static String solver(String filename) {
    try {
      File f1 = new File(filename);
      Scanner input = new Scanner(f1);
      String passcode = "";

      while(input.hasNextLine()) {
        int digit = 5;
        String line = input.nextLine();
        // System.out.println(line);
        for (int i = 0; i < line.length(); i++) {
          if (line.charAt(i) == "L") {
            if (!digit % 3 == 1) {
              digit--;
            }
          }
          // if (line.charAt(i) == "U") {
          //   if (!digit % 3 == 1) {
          //     digit--;
          //   }
          // }
        }
      }

      input.close();
      return passcode;
    }
    catch (FileNotFoundException ex) {
      System.out.println("FIle not found");
      return "no passcode";
    }
  }

  public static void main (String[] args) {
    System.out.println(solver("day2input.txt"));
  }
}
