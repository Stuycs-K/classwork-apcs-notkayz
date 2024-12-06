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
}
