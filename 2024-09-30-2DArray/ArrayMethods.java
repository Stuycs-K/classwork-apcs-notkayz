//Karen: kau-yeung60@stuy.edu : karena101@nycstudents.net
//Kayden: kau60@stuy.edu ; kaydena6@nycstudents.net

public class ArrayMethods{
  public static void main(String args[]){
    //System.out.println("Expected: [2, 3, 4, 9] vs my function: " + aryToString(new int[2, 3, 4, 9]));
    System.out.println("Expected: {{2, 3, 4}, {5, 6, 7}, {2, 4, 9}} vs my function: " + arrToString(new int[][]{{2, 3, 4}, {5, 6, 7}, {2, 4, 9}}));
    //System.out.println("Expected: 42 vs my function: " + arr2DSum(new int[][]{{2, 3, 4}, {5, 6, 7}, {2, 4, 9}}));
    //System.out.println("Expected: {{1, 4}, {2, 5}, {3, 6}} vs my function: " + swapRC(new int[] [] {{1, 2, 3}, {4, 5, 6}}));
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

  public static String arrToString(int[][] nums) {
    String ans = "{{";
    for (int i = 0; i < nums.length; i++){
      ans += aryToString(nums[i]);
    }
    for (int i = 0; i < nums.length; i++) {
      //ans += nums[i];
      if (i < nums.length - 1) {
        ans += ", ";
      for (int j = 0; j < nums[i].length; j++) {
        ans += nums[i][j];
        if (j < nums[i].length - 1) {
          ans += ", ";
        }
      }
    }
    ans += "}";
  }
  return ans + "}}";
}
}
