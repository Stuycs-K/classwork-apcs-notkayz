import java.util.*;
public class DemoCounter {
    public static void alterArray(int[] data, int[] data2) {
        int[] nums2 = Arrays.copyOf(data, data.length);
        for (int i = 0; i < data.length; i++) {
            if (i % 2 == 0) {
                data[i] = 999;
            }
            else {
                data[i] = 0;
            }
        }
        data2 = nums2;
    }
    public static void main(String[] args) {
        int[] nums = new int[5];
        int[] nums2 = new int[5];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) Math.random() * 5;
        }
        alterArray(nums, nums2);
        System.out.println(Arrays.toString(nums2));
    }
}