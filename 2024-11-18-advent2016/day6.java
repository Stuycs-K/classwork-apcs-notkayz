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
      int rows = 0, columns  = 0;
      while (input.hasNextLine()) {
        String line = input.nextLine();
        columns = line.length();
        rows++;
      }
      Character[][] ary = new Character[rows][columns];

      input = new Scanner(f1);      // refill the input because it has been used
      int rows2 = 0;
      while (input.hasNextLine()) {
        String line = input.nextLine();
        for (int i = 0; i < columns; i++) {
          ary[rows2][i] = line.charAt(i);
        }
        rows2++;
      }
      String message = "";
      for (int i = 0; i < columns; i++) {
        int[] counter = new int[26];
        for (int j = 0; j < rows; j++) {
          counter[ary[j][i] - 'a']++;
        }
        // System.out.println(Arrays.toString(counter));
        int maxIndex = 0; 
        for (int k = 0; k < counter.length; k++) {
          if (counter[k] > counter[maxIndex]) {
            maxIndex = k;
          }
        }
        // System.out.println(maxIndex);
        int result = 'a' + maxIndex;
        message += (char) result;
      }
      // System.out.println(Arrays.toString(counter));
      
      // System.out.println(Arrays.deepToString(ary));
      input.close();
      return message;
    }
    catch (FileNotFoundException ex) {
      System.out.println("File not found");
      return "";
    }
  }
}
