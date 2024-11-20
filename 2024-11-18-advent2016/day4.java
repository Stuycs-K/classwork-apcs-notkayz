import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class day4 {
    public static int solver(String filename) {
        try {
            File f1 = new File(filename);
            Scanner input = new Scanner(f1);
            int sum = 0; 
            while (input.hasNextLine()) {
                String line = input.nextLine();
                int[] counter = new int[26];
                for (int i = 0; i < line.length(); i++) {
                    if (Character.isLetter(line.charAt(i))) {
                        counter[line.charAt(i) - 'a']++;
                        // System.out.println(line.charAt(i));
                    }
                } 
                // System.out.println(Arrays.toString(counter));
            }

            input.close();
            return sum;
        }
        catch (FileNotFoundException ex) {
            System.out.println("File not found");
            return -1;
        }
    }

    public static void main (String[] args) { 
        System.out.println(solver("day4input.txt"));
    }
}