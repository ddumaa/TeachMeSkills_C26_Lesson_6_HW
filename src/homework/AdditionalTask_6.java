package homework;

public class AdditionalTask_6 {
    public static void main(String[] args) {
        int[] arrays = {2, 4, -6, 7, -1, 8, 3, 10, -9, 1};
        for (int i = 0; i < arrays.length; i++) {
            for (int j = i; j < arrays.length; j++) {
                for (int k = j; k < arrays.length; k++) {
                    if(arrays[i] + arrays[j] + arrays[k] == 0 && i!=j && j!=k) {
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
