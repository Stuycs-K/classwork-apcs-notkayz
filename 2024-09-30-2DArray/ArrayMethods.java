//Karen: kau-yeung60@stuy.edu : karena101@nycstudents.net
//Kayden: kau60@stuy.edu ; kaydena6@nycstudents.net

public class ArrayMethods{
  public static void main(String args[]){

    // test cases for 1D arrToString
    System.out.println("Expected: [2, 3, 4, 9] vs my function: " + arrToString(new int[] {2, 3, 4, 9}));
    System.out.println("Expected: [10, 42, 1, 124] vs my function: " + arrToString(new int[] {10, 42, 1, 124}));

    // test cases for 2D arrToString
    System.out.println("Expected: [[2, 3, 4], [5, 6, 7], [2, 4, 9]] vs my function: " + arrToString(new int[][]{{2, 3, 4}, {5, 6, 7}, {2, 4, 9}}));
    System.out.println("Expected: [[10, 42, 1, 124], [40, 30, 72], [8, 44, 0]] vs my function: " + arrToString(new int[][] {{10, 42, 1, 124}, {40, 30, 72}, {8, 44, 0}}));

    // test cases for arr2DSum
    System.out.println("Expected: 42 vs my function: " + arr2DSum(new int[][]{{2, 3, 4}, {5, 6, 7}, {2, 4, 9}}));
    System.out.println("Expected: 499 vs my function: " + arr2DSum(new int[][]{{10, 42, 124}, {25, 68, 73}, {20, 42, 95}}));

    // test cases for swapRC
    System.out.println("Expected: [[1, 4], [2, 5], [3, 6]] vs my function: " + arrToString(swapRC(new int[][]{{1, 2 , 3}, {4, 5 , 6}})));
    System.out.println("Expected: [[9, 8], [3, 2], [7, 4]] vs my function: " + arrToString(swapRC(new int[][]{{9, 3, 7}, {8, 2, 4}})));
  }

  public static String arrToString(int[] nums) {
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
    String ans = "[";
    for (int i = 0; i < nums.length; i++){
      ans += arrToString(nums[i]);
      if (i < nums.length - 1) {
        ans += ", ";
      }
    }
    return ans + "]";
  }

  public static int arr2DSum(int[][] nums) {
    int sum = 0; 
    for (int i = 0; i < nums.length; i++) {
      for (int j = 0; j < nums[i].length; j++) {
        sum += nums[i][j];
      }
    }
    return sum;
  }

  public static int[][] swapRC(int[][] nums) {
    int[][] swappedArr = new int[nums[0].length][nums.length];
    for (int i = 0; i < nums.length; i++) {
      for (int j = 0; j < nums[i].length; j++) {
        swappedArr[j][i] = nums[i][j];
      }
    }
    return swappedArr;
  }
}
