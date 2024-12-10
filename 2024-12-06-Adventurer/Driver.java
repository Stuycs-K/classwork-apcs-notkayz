public class Driver {
  public static void main (String[] args) {

    // new instances of mages
    Adventurer player1 = new Mage();
    Adventurer player2 = new Mage();
    Adventurer ally1 = new Mage();
    
    /*
    // special name for mage
    System.out.println("Special name is: " + player1.getSpecialName() + ". Expected: Sorcerer");
    
    // special attribute of mages + changing that attribute to a diff value
    System.out.println("Player 1 has " + player1.getSpecial() + " mana.");
    player1.setSpecial(400);  // changes player 1's mana to 400
    System.out.println("Player 1 has " + player1.getSpecial() + " mana.");
    
    player1.setSpecial(501); // should be 400 because 501 > the max
    System.out.println("Player 1 has " + player1.getSpecial() + " mana.");
    
    System.out.println("Player 1 has a maximum of " + player1.getSpecialMax() + " mana, but only has " + player1.getSpecial() + " mana right now.");
    */
    
    // testing interaction methods
    System.out.println(player2.getHP());
    System.out.println(player1.attack(player2) + ": Expected hit for 200 damage");
    System.out.println("Expected: 800, Result: " + player2.getHP()); // should be 800 now
    
    System.out.println(player1.support(ally1)); // ally1 should have max health increased
    System.out.println("Ally 1 now has " + ally1.getHP() + " HP and a max HP of " + ally1.getmaxHP()+ ".");
    
    System.out.println(player1.support());  // player 1's max health should increase by 100
    System.out.println("Player 1 now has " + player1.getHP() + " HP and a max HP of " + player1.getmaxHP()+ ".");
    
    System.out.println(player1.specialAttack(player2)); // player 2 should have 400 health left
    System.out.println("Player 2 now has " + player2.getHP() + " HP and a max HP of " + player2.getmaxHP()+ ".");

  }
}
