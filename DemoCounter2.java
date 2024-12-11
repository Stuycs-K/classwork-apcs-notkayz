import java.util.*;
public class DemoCounter2 {
    public static void arrayMixer(int[] data) {
        for (int i = 0; i < data.length - 1; i++) {
            if (data[i] < 10) {
                data[i] = data[i + 1] - 4;
            }
            else {
                data[i] = data[i - 1] + data[i];
            }
        }
    }
    public static void main(String[] args) {
        int[] nums = new int[] {2, 7, 18, 4, 5};

        arrayMixer(nums);
        System.out.println(Arrays.toString(nums));
    }
}
