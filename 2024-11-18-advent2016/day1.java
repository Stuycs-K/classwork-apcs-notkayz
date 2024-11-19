import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class day1 {

  public static int part1(String filename) {
    try {
      int x = 0;
      int y = 0;
      int dir = 0;
      File f1 = new File(filename);
      Scanner input = new Scanner(f1);

      while (input.hasNext()) {
        String line = input.nextLine();
        String[] moves = line.split(", ");
        for (int i = 0; i < moves.length; i++) {
          String leftOrRight = moves[i].substring(0, 1);
          int distance = Integer.parseInt(moves[i].substring(1));
          // System.out.println(leftOrRight + "+" + distance);
          if (leftOrRight.equals("R")) {
            dir++;
          }
          if (leftOrRight.equals("L")) {
            dir += 3;
          }
          if (dir % 4== 0) {
            y += distance;
          }
          if (dir % 4 == 1) {
            x += distance;
          }
          if (dir % 4 == 2) {
            y -= distance;
          }
          if (dir % 4 == 3) {
            x -= distance;
          }
        }
      }
      input.close();
      return Math.abs(x) + Math.abs(y);
    }
      catch (FileNotFoundException ex) {
      System.out.println("File not found!");
      return -1;
    }
  }

  public static void main(String[] args) {
    System.out.println(part1("day1input.txt"));
  }
}
