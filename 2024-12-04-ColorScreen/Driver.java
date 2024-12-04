public class Driver {

    public static void makeBorder(int colorID) {
        Text.color(Text.background(colorID));

        // vertical borders at column 1 and 31
        for (int i = 1; i <= 80; i++) {
            Text.go(i,1);
            System.out.print("|");
            Text.go(i,31);
            System.out.print("|");
        }

        // horizontal border at row 1 and 81 
        for (int i = 1; i <= 31; i++) {
            Text.go(1, i);
            System.out.print("-");
            Text.go(81, i);
            System.out.print("-");
        }
        // for (int i = 0; i < 30; i++) {
        //     System.out.print("=");
        // }
        // Text.go(81, 1);
        // for (int i = 0; i < 30; i++) {
        //     System.out.print("-");
        // }
    }
    public static void main (String[] args) {
        System.out.print(Text.CLEAR_SCREEN);
        System.out.print(Text.HIDE_CURSOR);

        makeBorder(34);
        System.out.println(Text.RESET);
    }
}