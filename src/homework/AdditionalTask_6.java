package homework;

/**
 * Дан массив S из n целых чисел.
 * Существуют ли элементы a, b, c в S такие, что a + b + c = 0?
 * Найдите все уникальные триплеты в массиве, сумма которых равна нулю.
 * Примечание: элементы в тройке (a,b,c) должны быть в порядке неубывания. (т.е. а ≤ b
 * ≤ c).
 * В наборе решений не должно быть повторяющихся троек.
 */
public class AdditionalTask_6 {
    public static void main(String[] args) {
        int[] arrays = {-6, 2, 4, 7, -1, 0, -10, 8, 3, 10, -9, 1};
        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays.length; j++) {
                for (int k = 0; k < arrays.length; k++) {
                    if(arrays[i] + arrays[j] + arrays[k] == 0 && arrays[i] <= arrays[j] && arrays[j] <= arrays[k] && i!=j && j!=k) {
                        System.out.println(arrays[i] + " + " + arrays[j] + " + " + arrays[k] + " = 0");
                    }else if (i == arrays.length-1) {
                        System.out.println("there are no more combinations");
                        return;
                    }
                }
            }
        }
    }
}
