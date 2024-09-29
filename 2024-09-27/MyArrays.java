public class MyArrays {
  public static void main(String args[]) {
    // arrays to test
    // test cases
    int[] tstAry1 = new int[] {0, 1, 2, 3};
    int[] tstAry2 = new int[] {10, 9, 8, 7};
    System.out.println("Expected: [0, 1, 2, 3] vs my function: " + aryToString(returnCopy(tstAry1)));
    System.out.println("Expected: [10, 9, 8, 7, 0, 1, 2, 3] vs my function: " + aryToString(concatArray(tstAry2, tstAry1)));

    System.out.println("Expected: [10, 9, 8, 7] vs my function: " + aryToString(returnCopy(tstAry2)));
    System.out.println("Expected: [0, 1, 2, 3, 10, 9, 8, 7] vs my function: " + aryToString(concatArray(tstAry1, tstAry2)));
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
