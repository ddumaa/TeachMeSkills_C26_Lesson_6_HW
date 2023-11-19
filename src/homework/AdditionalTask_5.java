package homework;

import java.util.Scanner;

/**
 * Дан массив целых чисел, найдите два числа, которые в сумме дают заданное число.
 * Функция twoSum должна возвращать индексы двух чисел так, чтобы они складывались
 * в целевое число.
 * Например:
 * Ввод: числа={2, 7, 11, 15}, цель=9.
 * Выход: индекс1=0, индекс2=1.
 */
public class AdditionalTask_5 {
    public static void main(String[] args) {
        int[] arrays = {2, 4, 7, 8, 3};
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number to find the sum of two numbers in an array");
        int num = scanner.nextInt();
        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays.length; j++) {
                if(arrays[i] + arrays[j] == num && i != j){
                System.out.println("index1 = " + i + ", index2 = "+ j);
                return;
                } else if (i == arrays.length-1){
                    System.out.println("no such combination was found");
                    break;
                }
            }
        }
    }
}
