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

      while (input.hasNextLine()) {
        String line = input.nextLine();
        String[] moves = line.split(",");
        for (int i = 0; i < moves.length; i++) {
          // System.out.println(moves[i].substring(2));
          if (!moves[i].substring(2).isEmpty()) {
            int forwardSteps = Integer.parseInt(moves[i].substring(2));
            String lOrR = moves[0];
            if (lOrR == "R") {
              dir++;
            } else if (lOrR == "L") {
              dir += 3;
            }
            if (dir % 4 == 0) {
              y += forwardSteps;
            }
            if (dir % 4 == 1) {
              x += forwardSteps;
            }
            if (dir % 4 == 2) {
              y -= forwardSteps;
            }
            if (dir % 4 == 3) {
              x -= forwardSteps;
            }
          }
        }
      }
      // if (direction % 4 == 0) {
      // if (moves[i].contains("R")) {
      // direction++;
      // if (!moves[i].substring(2).isEmpty()) {
      // x += Integer.parseInt(moves[i].substring(2));
      // }
      // }
      // if (moves[i].contains("L")) {
      // direction += 3;
      // if (!moves[i].substring(2).isEmpty()) {
      // x -= Integer.parseInt(moves[i].substring(2));
      // }
      // }
      // }

      // if (direction % 4 == 1) {
      // if (moves[i].contains("R")) {
      // direction++;
      // if (!moves[i].substring(2).isEmpty()) {
      // y -= Integer.parseInt(moves[i].substring(2));
      // }
      // }
      // if (moves[i].contains("L")) {
      // direction += 3;
      // if (!moves[i].substring(2).isEmpty()) {
      // y += Integer.parseInt(moves[i].substring(2));
      // }
      // }
      // }

      // if (direction % 4 == 2) {
      // if (moves[i].contains("R")) {
      // direction++;
      // if (!moves[i].substring(2).isEmpty()) {
      // x -= Integer.parseInt(moves[i].substring(2));
      // }
      // }
      // if (moves[i].contains("L")) {
      // direction += 3;
      // if (!moves[i].substring(2).isEmpty()) {
      // x += Integer.parseInt(moves[i].substring(2));
      // }
      // }
      // }

      // if (direction % 4 == 3) {
      // if (moves[i].contains("R")) {
      // direction++;
      // if (!moves[i].substring(2).isEmpty()) {
      // y += Integer.parseInt(moves[i].substring(2));
      // }
      // }
      // if (moves[i].contains("L")) {
      // direction += 3;
      // if (!moves[i].substring(2).isEmpty()) {
      // y -= Integer.parseInt(moves[i].substring(2));
      // }
      // }
      // }
      input.close();
      return Math.abs(x) + Math.abs(y);
    } catch (FileNotFoundException ex) {
      System.out.println("File not found!");
      return -1;
    }
  }

  public static void main(String[] args) {
    System.out.println(part1("day1input.txt"));
  }
}
