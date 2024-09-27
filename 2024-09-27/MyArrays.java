public class MyArrays {
  public static void main(String args[]) {
    // arrays to test
    // test cases
    //System.out.println("Expected: [0, 1, 2, 3] vs my function: " + returnCopy([0, 1, 2, 3]));
    //System.out.println("Expected: [10, 9, 8, 1, 2, 3] vs my function: " + concatArray([10, 9, 8]));
  }
  public static String aryToString(int[] nums) {
    String ans = "[";
    for (int i = 0; i < nums.length; i++) {
      ans += nums[i];
      if (i < nums.length - 1) {
        ans += ", ";
      }
    }
    return ans + "]";
  }
  public static int[] returnCopy(int[] ary) {
    int[] ary2 = new int[ary.length];
    for (int i = 0; i < ary.length; i++) {
      ary2[i] = ary[i];
    }
    return ary2;
  }
  public static int[] concatArray(int[] ary1, int[] ary2) {
    int[] combinedArray = new int[ary1.length + ary2.length];
    for (int i = 0; i < ary1.length; i++) {
      combinedArray[i] = ary1[i];
    }
    for (int j = 0; j < ary2.length; j++) {
      combinedArray[j + ary1.length] = ary2[j];
    }
    return combinedArray;
  }
}
