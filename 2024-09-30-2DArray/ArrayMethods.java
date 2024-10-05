//Karen: kau-yeung60@stuy.edu : karena101@nycstudents.net
//Kayden: kau60@stuy.edu ; kaydena6@nycstudents.net

public class ArrayMethods{
  public static void main(String args[]){
    /*
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
    

    // test cases for replaceNegative
    System.out.print("Expected: [[1, 0, 0], [0, 1, 0]] vs my function: "); 
    replaceNegative(new int[][] {{-2, -3, -2}, {-9, -239, -10}});

    System.out.print("Expected: [[1, 0, 0], [0, 1, 0]] vs my function: "); 
    replaceNegative(new int[][] {{-10, -52, -20}, {-6, -621, 0}});

    System.out.print("Expected: [[1, 0, 0], [0, 1, 0]] vs my function: "); 
    replaceNegative(new int[][] {{-5, -6, -12}, {-833, -123, -4}});
    */

    // test cases for copy
    int[][] testCase1 = new int[][] { { 1, 2, 3, 4, 5}, {6, 7, 8, 9, 10} };
    int[][] copiedTestCase1 = copy(testCase1);
    System.out.println("Expected: [[1, 2, 3, 4, 5], [6, 7, 8, 9, 10]] vs my function: " + arrToString(copiedTestCase1));
    testCase1 = new int[][] { {1, 2}, {3, 4}};
    System.out.println("Original array changed. Copied array: " + arrToString(copiedTestCase1));

    int[][] testCase2 = new int[][] { {5, 4, 3, 2, 1}, {10, 9, 8, 7, 6} };
    int[][] copiedTestCase2 = copy(testCase2);
    System.out.println("Expected: [[5, 4, 3, 2, 1], [10, 9, 8, 7, 6]] vs my function: " + arrToString(copiedTestCase2));
    testCase2 = new int[][] { {5, 4}, {10, 9}};
    System.out.println("Original array changed. Copied array: " + arrToString(copiedTestCase2));

    int[][] testCase3 = new int[][] { {0, 3, 6, 9, 12}, {0, 2, 4, 6, 8} };
    int[][] copiedTestCase3 = copy(testCase3);
    System.out.println("Expected: [[0, 3, 6, 9, 12], [0, 2, 4, 6, 8]] vs my function: " + arrToString(copiedTestCase3));
    testCase3 = new int[][] { {0, 3}, {0, 2}};
    System.out.println("Original array changed. Copied array: " + arrToString(copiedTestCase3));
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
  //3. Modify a given 2D array of integer as follows:
  //Replace all the negative values:
  //-When the row number is the same as the column number replace
  //that negative with the value 1
  //-All other negatives replace with 0
  public static void replaceNegative(int[][] vals){
    for (int i = 0; i < vals.length; i++) {
      for (int j = 0; j < vals[i].length; j++) {
        if (j == i && vals[i][j] < 0) {
          vals[i][j] = 1;
        }
        if (vals[i][j] < 0) {
          vals[i][j] = 0;
        }
      }
    }
    System.out.println(arrToString(vals));
  }

  //4. Make a copy of the given 2d array.
  //When testing : make sure that changing the original does NOT change the copy.
  //DO NOT use any built in methods that "copy" an array.
  //You SHOULD write a helper method for this.
  //If you don't see a good way to do that, you should stop and look at prior methods.
  public static int[][] copy(int[][] nums){
    int[][] copyArr = new int[nums.length][];
    for (int i = 0; i < nums.length; i++) {
      copyArr[i] = MyArrays.returnCopy(nums[i]);
    }
    return copyArr;
  }
}
