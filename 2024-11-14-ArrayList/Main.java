import java.util.ArrayList;
public class Main {
  public static void main(String[] args) {

    // createRandomArray() tests
    // System.out.println(ArrayListPractice.createRandomArray(5));
    // System.out.println(ArrayListPractice.createRandomArray(5));
    // System.out.println(ArrayListPractice.createRandomArray(5));
    // System.out.println(ArrayListPractice.createRandomArray(5));
    // System.out.println(ArrayListPractice.createRandomArray(100000));

    // replaceEmpty() tests
    // ArrayList<String> test = ArrayListPractice.createRandomArray(100000);
    // ArrayListPractice.replaceEmpty(test);
    // System.out.println(test);

    // makeReversedList() tests
    // ArrayList<String> tester = ArrayListPractice.createRandomArray(5);
    // System.out.println(tester);
    // System.out.println(ArrayListPractice.makeReversedList(tester));
    
    // mixLists() tests
    ArrayList<String> listA = ArrayListPractice.createRandomArray(5);
    ArrayList<String> listB = ArrayListPractice.createRandomArray(5);
    System.out.println(listA);
    System.out.println(listB);
    System.out.println(ArrayListPractice.mixLists(listA, listB));
    
    ArrayList<String> listC = ArrayListPractice.createRandomArray(5);
    ArrayList<String> listD = ArrayListPractice.createRandomArray(8);
    System.out.println(listC);
    System.out.println(listD);
    System.out.println(ArrayListPractice.mixLists(listC, listD));

    ArrayList<String> listE = ArrayListPractice.createRandomArray(8);
    ArrayList<String> listF = ArrayListPractice.createRandomArray(5);
    System.out.println(listE);
    System.out.println(listF);
    System.out.println(ArrayListPractice.mixLists(listE, listF));

  }
}
