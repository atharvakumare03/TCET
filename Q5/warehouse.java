package Q5;

import java.util.Arrays;

public class warehouse{
    public static void arrange(int[] crates) {
        int index = 0; 
        for (int num : crates) {
            if (num != 0) {
                crates[index++] = num;
            }
        }
        while (index < crates.length) {
            crates[index++] = 0;
        }
    }
    public static void main(String[] args) {
        int[] crates = {3,0,2,1,3,0};

        System.out.println("Crate order before sorting: " + Arrays.toString(crates));
        arrange(crates);
        System.out.println("Final arrangement of crates: " + Arrays.toString(crates));
    }
}
