public class Driver {
  public static void main (String[] args) {

    // new instances of mages
    Adventurer player1 = new Mage();
    Adventurer player2 = new Mage();
    Adventurer ally1 = new Mage();
    Adventurer ally2 = new Mage();

    // special name for mage
    System.out.println("Special name is: " + player1.getSpecialName() + ". Expected: Sorcerer");

    // special attribute of mages + changing that attribute to a diff value
    System.out.println("Player 1 has " + player1.getSpecial() + " mana.");
    player1.setSpecial(400);  // changes player 1's mana to 400
    System.out.println("Player 1 has " + player1.getSpecial() + " mana.");

  }
}
