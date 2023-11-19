package homework;

import java.util.Scanner;

public class AdditionalTask_3 {
    public static void bank(double a, int years){
        for (int i = 0; i <= years; i++) {
            a += a * 10.0/100;
        }
        System.out.println("Your contribution for " + years + " years, will be: " + a);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("how much do you want to deposit?");
        double a = scanner.nextDouble();
        System.out.println("For how long?");
        int years = scanner.nextInt();
        bank(a, years);
    }
}
