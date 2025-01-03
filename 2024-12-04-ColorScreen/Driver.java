import java.util.Arrays;
public class Driver {

    public static void makeBorder(int colorID) {
        Text.color(Text.background(colorID));

        // vertical borders at column 1 and 81
        for (int i = 1; i <= 31; i++) {
            Text.go(i,1);
            System.out.print("|");
            Text.go(i,81);
            System.out.print("|");
        }

        // horizontal border at row 1 and 31 
        for (int i = 1; i <= 81; i++) {
            Text.go(1, i);
            System.out.print("-");
            Text.go(31, i);
            System.out.print("-");
        }
    }

    public static int[] randomArray(int size) {
        int[] res = new int[size];
        for (int i = 0; i < res.length; i++) {
            res[i] = (int) (Math.random() * 100);
            // System.out.println(res[i]);
        }
        return res;
    }

    public static void displayEvenlySpaced(int[] ary) {
        for (int i = 1; i <= 3; i++) {
            Text.go(2, (20 * i));
            if(ary[i - 1] > 75) {
                Text.color(Text.GREEN, Text.BRIGHT);
            }
            if(ary[i - 1] < 25) {
                Text.color(Text.RED, Text.BRIGHT);
            }
            System.out.print(ary[i - 1]);
        }
    }

    public static void addDivider(int colorID) {
        Text.color(Text.background(colorID));
        for (int i = 2; i <= 80; i++ ) {
            Text.go(3, i);
            System.out.print("=");
        }
    }

    public static void writeInputCenter(String input, int colorID) {
        Text.color(colorID);
        int halfLength = input.length() / 2;
        Text.go(16, 41 - halfLength);
        System.out.print(input);
    }
    public static void main (String[] args) {
        System.out.print(Text.CLEAR_SCREEN);
        System.out.print(Text.HIDE_CURSOR);

        int[] x = randomArray(3);
        displayEvenlySpaced(x);
        addDivider(Text.YELLOW);

        // writeInput("Hello!",37);
        // writeInput("Are you sure?!",37);
        writeInputCenter("What are you doing!?",37);

        // making the border has to be last 
        makeBorder(Text.BLUE);
        
        Text.go(31,1);
        // System.out.println(Arrays.toString(x));
        
        System.out.println(Text.RESET);
    }
}