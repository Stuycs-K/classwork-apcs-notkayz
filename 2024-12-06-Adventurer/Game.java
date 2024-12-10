import java.util.Scanner;
public class Game {
  public static void main(String[] args) {
    Adventurer a1 = new CodeWarrior("CodeWarrior One", 100, "java");
    Adventurer a2 = new CodeWarrior("CodeWarrior Two", 100);
    boolean quit = false;

    while (!quit) {
        // displaying adventurer stats
      System.out.println("User: " + a1 + " has " + a1.getHP() + "/" + a1.getmaxHP() +" HP and " + a1.getSpecial() + "/" + a1.getSpecialMax() + " " + a1.getSpecial());
      System.out.println("Enemy: " + a2 + " has " + a2.getHP() + "/" + a2.getmaxHP() +" HP and " + a2.getSpecial() + "/" + a2.getSpecialMax() + " " + a2.getSpecial());

        // prompting for action input
      Scanner userInput = new Scanner(System.in);
      System.out.println("Enter an action: (a)ttack / (sp)ecial / (su)pport / quit ");
      String action1 = userInput.nextLine();
      if (action1.equals("a") || action1.equals("attack")) {
        System.out.println(a1.attack(a2));
      }
      if (action1.equals("sp") || action1.equals("special")) {
        System.out.println(a1.specialAttack(a2));
      }
      if (action1.equals("su") || action1.equals("support")) {
        System.out.println(a1.support());
      }
      if (action1.equals("quit")) {
        quit = true;
      }
      int randomAction = (int) (Math.random() * 3);
      if (randomAction == 0) {
        System.out.println(a2.attack(a1));
      }
      if (randomAction == 1) {
        System.out.println(a2.specialAttack(a1));
      }
      if (randomAction == 2) {
        System.out.println(a2.support());
      }
    }
  }
}
