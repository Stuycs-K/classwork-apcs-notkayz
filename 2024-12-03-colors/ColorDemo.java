public class ColorDemo {

  // USEFUL SEQUENCES
  public static final String CLEAR_SCREEN =  "\u001b[2J";
  public static final String HIDE_CURSOR =  "\u001b[?25l";
  public static final String SHOW_CURSOR =  "\u001b[?25h";

  // COLORS
  // public static int DEFAULT = 0;
  // public static int BLACK = 30;
  // public static int RED = 31;
  // public static int GREEN = 32;
  // public static int YELLOW = 33;
  // public static int BLUE = 34;
  // public static int MAGENTA = 35;
  // public static int CYAN = 36;
  // public static int WHITE = 37;

  public static int[] colors = new int[] {30, 31, 32, 33, 34, 35, 36, 37};

  public static void makeScreenRainbow() {
    for (int i = 0; i < colors.length; i++) {
      System.out.print("\u001b[" + colors[i] + "m");
      System.out.print("\u001b[" + (colors[i] + 10) + "m");
      for (int j = 0; j < 100; j++) {
        System.out.print("______");
      }
      System.out.println();
    }
  }

  public static void makeMyTextColorful(String text, String rgbOrUnix) {
    if (rgbOrUnix.equals("unix")) {
      for (int i = 0; i < 100; i++) {
        System.out.print("\u001b[" + ((int) (Math.random() * 7 + 30)) + "m");
        System.out.print(text + "  ");
      }
    }
    else if (rgbOrUnix.equals("rgb")) {
      for(int r = 0; r < 256; r+=16){
        for(int g = 0; g <= 256; g+=16){
          for(int b = 0; b <= 256; b+=16){
            System.out.print("\u001b[38;2;"+r+";"+g+";"+b+";7m.");
            System.out.print(text + "  ");
          }
        }
      }
    }
    else {
      System.out.println("Not A Valid Type");
    }
  }

  public static void main (String[] args) {
    // System.out.print(CLEAR_SCREEN);
    // makeScreenRainbow();
    makeMyTextColorful("hahahahahaha", "rgb");
  }
}
