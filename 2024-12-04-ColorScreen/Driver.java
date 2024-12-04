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
            res[i] = (int) Math.random() * 100;
        }
        return res;
    }
    public static void main (String[] args) {
        System.out.print(Text.CLEAR_SCREEN);
        System.out.print(Text.HIDE_CURSOR);

        makeBorder(34);

        System.out.println(Arrays.toString(randomArray(3)));
        System.out.println(Text.RESET);
    }
}