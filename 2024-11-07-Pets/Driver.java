/* When calling .speak() with the Bird object, it accesses the overriden version of getName(),
   instead of the original getName() in the Animal Class. However if you call the .speak() method
   with an Animal object, it will use the original getName(). */
/* The Bird b2 = new Animal does not work, because the super-class, Animal, is not a Bird, 
   the sub-class. Although a Bird is-a Animal, the contrary is not true. Bird hard more features 
   that cannot be fufilled by the animal class. */
public class Driver{
  public static void main(String[] args){
    Animal toucan = new Animal("squack", 5, "Lenny");
    toucan.speak();
    Bird LennyJr = new Bird("SQUACK", 2, "Lenny Jr", 10.5, "rainbow");
    LennyJr.speak();

    // step 9
    Animal a1 = new Animal("moo", 1, "cow");
    Bird b1 = new Bird("caw caw", 2, "raven", 25, "black");
    // Bird b2 = new Animal("meow", 3, "birb"); this one doesnt work 
    Animal a2 = new Bird("chirp chirp", 2, "max", 20, "blue");
    a1.speak();
    b1.speak();
    a2.speak();
  }
}
