public class Mage extends {
  private int mana, maxMana;

  public String getSpecialName() {
    return "Sorcerer";
  }

  //accessor methods
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
      return "Buffed "
    }
    other.setHP(other.getHp() + (mana / 2));
    return "Healed " + other.getName() + " for " + (mana / 2) + " health.";
  }

  public String support()
}
