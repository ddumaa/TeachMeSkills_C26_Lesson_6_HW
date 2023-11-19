package homework;

import java.util.Scanner;
/**Банковский вклад.
 Пользователь делает вклад в размере a рублей сроком на years лет под 10% годовых
 (каждый год размер его вклада увеличивается на 10%.Эти деньги прибавляются к
 сумме вклада, и на них в следующем году тоже будут проценты).
 Написать программу bank, принимающая аргументы a и years, и возвращающую
 сумму, которая будет на счету пользователя.
 */
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
