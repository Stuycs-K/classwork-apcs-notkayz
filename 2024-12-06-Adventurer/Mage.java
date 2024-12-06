abstract public class Mage extends Adventurer{
  
  // instance variables
  private int mana, maxMana;

  // no arg constructor
  public Mage() {
    super("Mage", 100);
    int mana = 100;
    int maxMana = 500;
  }

  //accessor methods
  public String getSpecialName() {
    return "Sorcerer";
  }

  public int getSpecial() {
    return this.mana;
  }

  public void setSpecial(int n) {
    this.mana = n;
  }

  public int getSpecialMax() {
    return this.maxMana;
  }

  //
  public String attack(Adventurer other) {
    other.applyDamage(this.mana);
    return "Hit " + other.getName() + " for " + mana + " damage!";
  }

  public String support(Adventurer other) {
    if (other.getHP() + (mana / 2) > other.getmaxHP()) {
      other.setmaxHP(other.getmaxHP() + (mana / 2));
      other.setHP(other.getHP() + (mana / 2));
      return "Increased max health of " + other.getName() + "!";
    }
    other.setHP(other.getHP() + (mana / 2));
    return "Healed " + other.getName() + " for " + (mana / 2) + " health.";
  }

  public String support() {
    if (this.getHP() + (mana / 2) > this.getmaxHP()) {
      this.setmaxHP(this.getmaxHP() + (mana / 2));
      this.setHP(this.getHP() + (mana / 2));
      return "Increase my max hp by " + (mana / 2) + "!";
    }
    this.setHP(this.getHP() + (mana / 2));
    return "Healed myself for " + (mana / 2) + " health.";
  }
}
