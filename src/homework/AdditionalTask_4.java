package homework;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Повернуть массив из n элементов вправо на k шагов.
 * Например, с n = 7 и k = 3 массив [1,2,3,4,5,6,7] вращается до [5,6,7,1,2,3,4].
 */
public class AdditionalTask_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the length of the array");
        int arraysLong = scanner.nextInt();
        System.out.println("enter how much to shift the array to the right");
        int move = scanner.nextInt();

        int[] arrays = new int[arraysLong];
        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = i;
        }
        System.out.println(Arrays.toString(arrays));

        for (int i = 0; i < move; i++) {
            int n = arrays[arrays.length-1];
                for (int j = arraysLong - 1; j >= 0; j--) {
                    if (j >= 1) {
                        arrays[j] = arrays[j - 1];
                    } else {
                        arrays[0] = n;
                    }
                }
        }
        System.out.println(Arrays.toString(arrays));
    }
}
