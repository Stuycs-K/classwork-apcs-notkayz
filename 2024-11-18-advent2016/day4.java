import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
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
                Character[] letters = new Character[5];
                for (int i = 0; i < line.length() - 7; i++) {
                    if (Character.isLetter(line.charAt(i))) {
                        counter[line.charAt(i) - 'a']++;
                        // System.out.println(line.charAt(i));
                    }
                }
                int maxIndex = 0;
                for (int i = 0; i < letters.length; i++) {
                    for (int j = 0; j < counter.length; j++) {
                        if (counter[j] > counter[maxIndex]) {
                            maxIndex = j;
                        }
                    }
                    counter[maxIndex] = 0;
                    int result = 'a' + maxIndex;
                    letters[i] = (char) result;
                }
                boolean checksum = false;
                System.out.println(line.substring(line.length() - 7, line.length()));
                // for (int i = 0; i < letters.length; i++) {
                //     if (letters[i].equals(line.charAt(line.length() - 7 + i))) {

                //     }
                // }
                // System.out.println(Arrays.toString(letters));
                // System.out.println(maxIndex);
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
