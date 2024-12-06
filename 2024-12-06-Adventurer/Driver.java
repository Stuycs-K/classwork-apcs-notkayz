public class Driver {
  public static void main (String[] args) {

    // new instances of mages
    Adventurer player1 = new Mage();
    Adventurer player2 = new Mage();
    Adventurer ally1 = new Mage();
    Adventurer ally2 = new Mage();

    // special name for mage
    System.out.println("Special name is: " + player1.getSpecialName() + ". Expected: Sorcerer");

    
  }
}
