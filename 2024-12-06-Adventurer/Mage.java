public class Mage extends Adventurer{
  
  // instance variables
  private int mana, maxMana;

  // no arg constructor
  public Mage() {
    super("Mage", 1000);
    mana = 200;
    maxMana = 500;
  }

  //accessor methods
  public String getSpecialName() {
    return "Sorcerer";
  }

  public int getSpecial() {
    return this.mana;
  }

  public void setSpecial(int n) {
    if (n < this.maxMana) {
      this.mana = n;
    }
    else {
      System.out.println("Value exceeds maximum value!");
    }
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
      return "Increased your max hp by " + (mana / 2) + "!";
    }
    this.setHP(this.getHP() + (mana / 2));
    return "Healed yourself for " + (mana / 2) + " health.";
  }

  public String specialAttack(Adventurer other) {
    int tempMana;
    if (this.mana * 2 < this.maxMana) {
      tempMana = mana * 2;
    }
    else {
      tempMana = maxMana;
    }
    other.applyDamage(tempMana);
    return "Special Attack dealt " + tempMana + " damage to " + other.getName();
  }
}
