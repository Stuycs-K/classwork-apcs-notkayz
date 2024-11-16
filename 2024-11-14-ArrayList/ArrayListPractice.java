import java.util.ArrayList;

public class ArrayListPractice {
  public static ArrayList<String>createRandomArray(int size) {
    ArrayList<String>result = new ArrayList<String>(size);
    for (int i = 0; i<size; i++) {
      int num = (int)(10*Math.random());
      if (num == 0) {
        result.add(i, "");
      }
      else {
        result.add(i, ""+num);
      }
    }
    return result;
  }

  public static void replaceEmpty(ArrayList<String>original) {
    for (int i = 0; i <original.size(); i++) {
      if (original.get(i).equals("")) {
        original.set(i, "Empty");
      }
    }
  }

  public static ArrayList<String>makeReversedList(ArrayList<String>original) {
    System.out.println(original.size());
    ArrayList<String>result = new ArrayList<String>(original.size());
    for (int i = original.size() - 1; i >= 0; i--) {
      result.add(original.get(i));
    }
    return result;
  }

  public static ArrayList<String>mixLists(ArrayList<String> a, ArrayList<String> b) {
    int shorterLength = Math.min(a.size(), b.size());
    ArrayList<String>result = new ArrayList<String>(a.size() + b.size());
    for (int i = 0; i < shorterLength; i++) {
      result.add(a.get(i));
      result.add(b.get(i));
    }
    if (a.size() < b.size()) {
      result.addAll(b.subList(shorterLength, b.size()));
    }
    else {
      result.addAll(a.subList(shorterLength, a.size()));
    }
    return result;
  }
}
